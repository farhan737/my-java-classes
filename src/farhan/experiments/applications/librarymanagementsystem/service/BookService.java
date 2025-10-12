package farhan.experiments.applications.librarymanagementsystem.service;

import farhan.experiments.applications.librarymanagementsystem.model.Book;

public interface BookService {
	void addBook(Book book);

	void removeBook(int bookId);

	void searchBookByTitle(String title);

	void viewAllBooks();
}
