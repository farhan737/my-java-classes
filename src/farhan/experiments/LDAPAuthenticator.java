package farhan.experiments;

import farhan.experiments.interfaces.Authenticator;

public class LDAPAuthenticator implements Authenticator {
	String username = "farhan123";
	String password = "12345678";

	public boolean authenticate(String username, String password) {
		if (this.username.equals(username) && this.password.equals(password))
			return true;
		return false;
	}
}
