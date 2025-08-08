package farhan.experiments;

import java.util.Scanner;

public class UserBanking {
	// creating variables for balance amount, banking name and account password
	double balance;
	String bankingName;
	String password;
	// creating object for Scanner class for input from the console
	Scanner sc = new Scanner(System.in);
	// creating variable for commands from the user
	String command;

	// the no-arguement constructor for initializing data from the user for banking
	// name, password and balance
	// in the constructor we take the input for the values from the user at the
	// console
	public UserBanking() {
		System.out.println("enter banking name: ");
		String bankingName = sc.nextLine();
		System.out.println("enter balance: ");
		double balance = sc.nextDouble();
		System.out.println("set account password: ");
		String password = sc.next();
		this.balance = balance;
		this.bankingName = bankingName;
		this.password = password;
	}

	// the startBanking method authenticates the user using the password for that
	// particular user object.
	public void startBanking() {
		// a temporary variable to store the password from the user and then comparing
		// it with the actual password for that user object
		String temporaryPass;
		System.out.println("enter password for account named " + this.bankingName + ": ");
		temporaryPass = sc.next();
		// if the password is matching with the actual password we run the mainBanking
		// method
		if (temporaryPass.equals(this.password)) {
			System.out.println("welcome to vcube banking");
			mainBanking();
		} else {// if the password does not match with the actual password it again calls the
				// startBanking method
			System.out.println("wrong or invalid password");
			startBanking();
		}
	}

	// the mainBanking method has the main logic to read the command keywords from
	// the user console and run the corresponding methods for that command keyword
	public void mainBanking() {
		System.out.println("enter the command for the task: ");
		command = sc.next();
		// after the execution of a method we are again calling the mainBanking method
		if (command.equals("withdraw")) {
			withdraw();
			mainBanking();
		} else if (command.equals("display")) {
			display();
			mainBanking();
		} else if (command.equals("deposit")) {
			deposit();
			mainBanking();
		} else if (command.equals("changepassword")) {
			changePassword();
			mainBanking();
		} else if (command.equals("exit")) {
			//exit command calls the exitBanking method which brings the control out of the mainBanking method
			exitBanking();
		} else {
			System.out.println("invalid command, try again");
			mainBanking();
		}
	}

	public void withdraw() {
		System.out.println("enter amount to withdraw: ");
		int withdrawAmount = sc.nextInt();
		if (this.balance >= withdrawAmount)
			this.balance -= withdrawAmount;
		else
			System.out.println("insufficient balance.");
	}

	public void display() {
		System.out.println("the balance amount in the account: " + this.balance);
	}

	public void deposit() {
		System.out.println("enter the amount to deposit: ");
		double depositAmount = sc.nextDouble();
		this.balance += depositAmount;
	}

	public void changePassword() {
		System.out.println("first enter your old password: ");
		String temporaryPass = sc.next();
		if (temporaryPass.equals(this.password)) {
			System.out.println("enter new password: ");
			temporaryPass = sc.next();
			this.password = temporaryPass;
		}
	}

	public void help() {
		System.out.println("the commands are: ");
		System.out.println("withdraw");
	}

	public void exitBanking() {
		System.out.println("thank you!!!");
	}
}
