package farhan.experiments;

import farhan.experiments.interfaces.Authenticator;

public class DatabaseAuthenticator implements Authenticator {
	String username = "farhan123";
	String password = "12345678";

	@Override
	public boolean authenticate(String username, String password) {
		if (this.username.equals(username) && this.password.equals(password))
			return true;
		return false;
	}
}
