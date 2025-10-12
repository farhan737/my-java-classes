package farhan.experiments.applications.librarymanagementsystem;

import java.util.Scanner;

import farhan.experiments.applications.librarymanagementsystem.model.Book;
import farhan.experiments.applications.librarymanagementsystem.model.Student;
import farhan.experiments.applications.librarymanagementsystem.service.BookService;
import farhan.experiments.applications.librarymanagementsystem.service.LendingService;
import farhan.experiments.applications.librarymanagementsystem.service.StudentService;
import farhan.experiments.applications.librarymanagementsystem.service.impl.BookServiceImpl;
import farhan.experiments.applications.librarymanagementsystem.service.impl.LendingServiceImpl;
import farhan.experiments.applications.librarymanagementsystem.service.impl.StudentServiceImpl;

public class MainMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentService studentService = new StudentServiceImpl();
		BookService bookService = new BookServiceImpl();
		LendingService lendingService = new LendingServiceImpl();

		int choice = -1;

		while (choice != 0) {
			System.out.println("\n=== Library Management System ===");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. View All Students");
			System.out.println("4. Add Book");
			System.out.println("5. Remove Book");
			System.out.println("6. View All Books");
			System.out.println("7. Search Book");
			System.out.println("8. Lend Book");
			System.out.println("9. Collect Book");
			System.out.println("10. Renew Book");
			System.out.println("11. View Overdue Books");
			System.out.println("12. Generate Loans Report");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
			case 1 -> { // Add Student
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Department: ");
				String dept = sc.nextLine();
				System.out.print("Year: ");
				int year = sc.nextInt();
				sc.nextLine();
				System.out.print("Phone: ");
				String phone = sc.nextLine();

				Student student = new Student();
				student.setStudentName(name);
				student.setEmail(email);
				student.setDepartment(dept);
				student.setYear(year);
				student.setPhoneNumber(phone);

				studentService.addStudent(student);
			}
			case 2 -> { // Remove Student
				System.out.print("Student ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				studentService.removeStudent(id);
			}
			case 3 -> studentService.viewAllStudents();
			case 4 -> { // Add Book
				System.out.print("Title: ");
				String title = sc.nextLine();
				System.out.print("Author: ");
				String author = sc.nextLine();
				System.out.print("Publisher: ");
				String publisher = sc.nextLine();
				System.out.print("ISBN: ");
				String isbn = sc.nextLine();
				System.out.print("Total Copies: ");
				int total = sc.nextInt();
				sc.nextLine();

				Book book = new Book();
				book.setTitle(title);
				book.setAuthor(author);
				book.setPublisher(publisher);
				book.setIsbn(isbn);
				book.setTotalCopies(total);
				book.setAvailableCopies(total);

				bookService.addBook(book);
			}
			case 5 -> { // Remove Book
				System.out.print("Book ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				bookService.removeBook(id);
			}
			case 6 -> bookService.viewAllBooks();
			case 7 -> { // Search Book
				System.out.print("Keyword: ");
				String keyword = sc.nextLine();
				bookService.searchBookByTitle(keyword);
			}
			case 8 -> { // Lend Book
				System.out.print("Student ID: ");
				int studentId = sc.nextInt();
				System.out.print("Book ID: ");
				int bookId = sc.nextInt();
				sc.nextLine();
				lendingService.lendBook(studentId, bookId);
			}
			case 9 -> { // Collect Book
				System.out.print("Loan ID: ");
				int loanId = sc.nextInt();
				sc.nextLine();
				lendingService.collectBook(loanId);
			}
			case 10 -> { // Renew Book
				System.out.print("Loan ID: ");
				int loanId = sc.nextInt();
				sc.nextLine();
				lendingService.renewBook(loanId);
			}
			case 11 -> lendingService.viewOverdueBooks();
			case 12 -> lendingService.generateReport();
			case 0 -> System.out.println("Exiting... Goodbye!");
			default -> System.out.println("⚠️ Invalid choice. Try again.");
			}
		}

		sc.close();
	}
}
