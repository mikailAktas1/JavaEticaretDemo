package eTicaretOdev.core.concretes;

import eTicaretOdev.core.abstracts.LoginService;

public class Login implements LoginService{
	
	private String Email;
	private String Password;
	
	public Login(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
