package farhan.experiments.applications.librarymanagementsystem.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import farhan.experiments.applications.librarymanagementsystem.model.Book;
import farhan.experiments.applications.librarymanagementsystem.service.BookService;
import farhan.experiments.applications.librarymanagementsystem.util.DatabaseUtil;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook(Book book) {
		String query = "INSERT INTO books (title, author, publisher, isbn, total_copies, available_copies) VALUES (?, ?, ?, ?, ?, ?)";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, book.getTitle());
			statement.setString(2, book.getAuthor());
			statement.setString(3, book.getPublisher());
			statement.setString(4, book.getIsbn());
			statement.setInt(5, book.getTotalCopies());
			statement.setInt(6, book.getAvailableCopies());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("✅ Book added successfully!");
			}

		} catch (SQLException e) {
			System.err.println("❌ Database error while adding book.");
			e.printStackTrace();
		}
	}

	@Override
	public void removeBook(int bookId) {
		String query = "DELETE FROM books WHERE book_id = ?";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, bookId);

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("✅ Book deleted successfully!");
			} else {
				System.out.println("⚠️ No book found with ID " + bookId);
			}

		} catch (SQLException e) {
			System.err.println("❌ Database error while deleting book.");
			e.printStackTrace();
		}
	}

	@Override
	public void viewAllBooks() {
		String query = "SELECT book_id, title, author, publisher, isbn, total_copies, available_copies FROM books";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {

			System.out.println("=== All Books ===");
			System.out.printf("%-5s %-25s %-20s %-15s %-15s %-5s %-5s%n", "ID", "Title", "Author", "Publisher", "ISBN",
					"Total", "Available");

			while (resultSet.next()) {
				int id = resultSet.getInt("book_id");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String publisher = resultSet.getString("publisher");
				String isbn = resultSet.getString("isbn");
				int total = resultSet.getInt("total_copies");
				int available = resultSet.getInt("available_copies");

				System.out.printf("%-5d %-25s %-20s %-15s %-15s %-5d %-5d%n", id, title, author, publisher, isbn, total,
						available);
			}

		} catch (SQLException e) {
			System.err.println("❌ Database error while fetching books.");
			e.printStackTrace();
		}
	}

	@Override
	public void searchBookByTitle(String titleKeyword) {
		String query = "SELECT book_id, title, author, publisher, isbn, total_copies, available_copies "
				+ "FROM books WHERE title LIKE ?";

		try (Connection connection = DatabaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, "%" + titleKeyword + "%");

			try (ResultSet resultSet = statement.executeQuery()) {
				System.out.println("=== Search Results ===");
				System.out.printf("%-5s %-25s %-20s %-15s %-15s %-5s %-5s%n", "ID", "Title", "Author", "Publisher",
						"ISBN", "Total", "Available");

				boolean found = false;
				while (resultSet.next()) {
					found = true;
					int id = resultSet.getInt("book_id");
					String title = resultSet.getString("title");
					String author = resultSet.getString("author");
					String publisher = resultSet.getString("publisher");
					String isbn = resultSet.getString("isbn");
					int total = resultSet.getInt("total_copies");
					int available = resultSet.getInt("available_copies");

					System.out.printf("%-5d %-25s %-20s %-15s %-15s %-5d %-5d%n", id, title, author, publisher, isbn,
							total, available);
				}

				if (!found) {
					System.out.println("⚠️ No books found with title containing: " + titleKeyword);
				}
			}

		} catch (SQLException e) {
			System.err.println("❌ Database error while searching books.");
			e.printStackTrace();
		}
	}
}
