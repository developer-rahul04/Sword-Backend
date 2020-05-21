package service;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("ABC") && password.equals("123");
	}
}