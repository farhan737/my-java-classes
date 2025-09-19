package farhan.experiments.main;

import java.util.Scanner;

import farhan.experiments.DatabaseAuthenticator;
import farhan.experiments.LDAPAuthenticator;

public class CS2508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DatabaseAuthenticator dAuth = new DatabaseAuthenticator();
		LDAPAuthenticator ldapAuth = new LDAPAuthenticator();

		System.out.println("enter username: ");
		String username = sc.next();
		System.out.println("enter password: ");
		String password = sc.next();

		if (dAuth.authenticate(username, password)) {
			System.out.println("the credentials authenticated by DatabaseAuthenticator");
			if (ldapAuth.authenticate(username, password)) {
				System.out.println("the credentials authenticated by LDAPAuthenticator");
			} else
				System.out.println("failed to authenticate at LDAPAuthenticator");
		} else
			System.out.println("failed to authenticate at DatabaseAuthenticator");
		sc.close();
	}
}
