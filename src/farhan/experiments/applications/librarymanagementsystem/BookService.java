package farhan.experiments.applications.librarymanagementsystem;

public interface BookService {
	void addBook(Book book);

	void removeBook(int bookId);

	void searchBookByTitle(String title);

	void viewAllBooks();
}
