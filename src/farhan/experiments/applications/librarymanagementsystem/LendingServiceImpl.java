package farhan.experiments.applications.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import farhan.experiments.applications.librarymanagementsystem.service.LendingService;
import farhan.experiments.applications.librarymanagementsystem.util.DatabaseUtil;

public class LendingServiceImpl implements LendingService {

    private static final double FINE_PER_DAY = 5.0; // 5 units per day overdue

    @Override
    public void lendBook(int studentId, int bookId) {
        String checkBookQuery = "SELECT available_copies FROM books WHERE book_id = ?";
        String insertLoanQuery = "INSERT INTO loans (student_id, book_id, borrow_date, due_date) VALUES (?, ?, ?, ?)";
        String updateBookQuery = "UPDATE books SET available_copies = available_copies - 1 WHERE book_id = ?";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement checkStmt = connection.prepareStatement(checkBookQuery);
             PreparedStatement insertStmt = connection.prepareStatement(insertLoanQuery);
             PreparedStatement updateBookStmt = connection.prepareStatement(updateBookQuery)) {

            // Check if book is available
            checkStmt.setInt(1, bookId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                int available = rs.getInt("available_copies");
                if (available <= 0) {
                    System.out.println("⚠️ Book is not available for lending.");
                    return;
                }
            } else {
                System.out.println("⚠️ Book not found.");
                return;
            }

            LocalDate issueDate = LocalDate.now();
            LocalDate dueDate = issueDate.plusDays(14); // 2-week lending period

            // Insert loan
            insertStmt.setInt(1, studentId);
            insertStmt.setInt(2, bookId);
            insertStmt.setDate(3, java.sql.Date.valueOf(issueDate));
            insertStmt.setDate(4, java.sql.Date.valueOf(dueDate));
            insertStmt.executeUpdate();

            // Update book availability
            updateBookStmt.setInt(1, bookId);
            updateBookStmt.executeUpdate();

            System.out.println("✅ Book lent successfully. Due date: " + dueDate);

        } catch (SQLException e) {
            System.err.println("❌ Database error while lending book.");
            e.printStackTrace();
        }
    }

    @Override
    public void collectBook(int loanId) {
        String updateLoanQuery = "UPDATE loans SET return_date = ? WHERE loan_id = ?";
        String updateBookQuery = "UPDATE books SET available_copies = available_copies + 1 " +
                                 "WHERE book_id = (SELECT book_id FROM loans WHERE loan_id = ?)";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement updateLoanStmt = connection.prepareStatement(updateLoanQuery);
             PreparedStatement updateBookStmt = connection.prepareStatement(updateBookQuery)) {

            LocalDate returnDate = LocalDate.now();

            updateLoanStmt.setDate(1, java.sql.Date.valueOf(returnDate));
            updateLoanStmt.setInt(2, loanId);
            int updated = updateLoanStmt.executeUpdate();
            if (updated == 0) {
                System.out.println("⚠️ Loan ID not found.");
                return;
            }

            updateBookStmt.setInt(1, loanId);
            updateBookStmt.executeUpdate();

            double fine = calculateFine(loanId);
            if (fine > 0) {
                System.out.println("⚠️ Book returned. Fine due: " + fine);
            } else {
                System.out.println("✅ Book returned successfully. No fine.");
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error while collecting book.");
            e.printStackTrace();
        }
    }

    @Override
    public void renewBook(int loanId) {
        String query = "UPDATE loans SET due_date = due_date + INTERVAL 14 DAY WHERE loan_id = ? AND return_date IS NULL";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, loanId);
            int updated = stmt.executeUpdate();
            if (updated > 0) {
                System.out.println("✅ Book renewed for 14 more days.");
            } else {
                System.out.println("⚠️ Loan ID not found or book already returned.");
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error while renewing book.");
            e.printStackTrace();
        }
    }

    @Override
    public double calculateFine(int loanId) {
        String query = "SELECT due_date, return_date FROM loans WHERE loan_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, loanId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                LocalDate dueDate = rs.getDate("due_date").toLocalDate();
                java.sql.Date returnDateSql = rs.getDate("return_date");
                LocalDate returnDate = returnDateSql != null ? returnDateSql.toLocalDate() : LocalDate.now();

                long overdueDays = java.time.temporal.ChronoUnit.DAYS.between(dueDate, returnDate);
                return overdueDays > 0 ? overdueDays * FINE_PER_DAY : 0;
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error while calculating fine.");
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void viewOverdueBooks() {
        String query = "SELECT l.loan_id, s.name AS student, b.title AS book, l.due_date " +
                       "FROM loans l " +
                       "JOIN students s ON l.student_id = s.student_id " +
                       "JOIN books b ON l.book_id = b.book_id " +
                       "WHERE l.return_date IS NULL AND l.due_date < CURDATE()";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("=== Overdue Books ===");
            System.out.printf("%-5s %-20s %-25s %-12s%n", "LoanID", "Student", "Book", "Due Date");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-25s %-12s%n",
                        rs.getInt("loan_id"),
                        rs.getString("student"),
                        rs.getString("book"),
                        rs.getDate("due_date"));
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error while fetching overdue books.");
            e.printStackTrace();
        }
    }

    @Override
    public void generateReport() {
        String query = "SELECT l.loan_id, s.name AS student, b.title AS book, l.borrow_date, l.due_date, l.return_date " +
                       "FROM loans l " +
                       "JOIN students s ON l.student_id = s.student_id " +
                       "JOIN books b ON l.book_id = b.book_id";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("=== All Loans Report ===");
            System.out.printf("%-5s %-20s %-25s %-12s %-12s %-12s%n",
                    "LoanID", "Student", "Book", "Issue Date", "Due Date", "Return Date");

            while (rs.next()) {
                System.out.printf("%-5d %-20s %-25s %-12s %-12s %-12s%n",
                        rs.getInt("loan_id"),
                        rs.getString("student"),
                        rs.getString("book"),
                        rs.getDate("borrow_date"),
                        rs.getDate("due_date"),
                        rs.getDate("return_date") != null ? rs.getDate("return_date") : "Not Returned");
            }

        } catch (SQLException e) {
            System.err.println("❌ Database error while generating report.");
            e.printStackTrace();
        }
    }
}
