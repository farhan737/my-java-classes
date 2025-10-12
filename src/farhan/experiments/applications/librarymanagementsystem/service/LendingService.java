package farhan.experiments.applications.librarymanagementsystem.service;

public interface LendingService {
	void lendBook(int studentId, int bookId);

	void collectBook(int loanId);

	void renewBook(int loanId);

	double calculateFine(int loanId);

	void viewOverdueBooks();

	void generateReport();
}
