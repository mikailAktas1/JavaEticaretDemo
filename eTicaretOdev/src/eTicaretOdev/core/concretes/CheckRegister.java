package eTicaretOdev.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretOdev.Entities.concretes.User;

public class CheckRegister {
	public boolean checkEmail(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher marcher = pattern.matcher(user.getEmail());
		
		if(marcher.matches()) {
			return checkName(user);
		} else {
			System.out.println("Mail adresinizi kontrol ediniz.");
			return false;
		}
	}
	
	public boolean checkName(User user) {
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2 ) {
			System.out.println("Ad ve soyad en az 2 karakterden olusmalýdýr.");
			return false;
		} else {
			return checkPassword(user);
		}
	}
	
	
	public boolean checkPassword(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println("Parolaniz en az 6 karakterden olusmalýdýr");
			return false;
		} else {
			return checkDatabase(user);
		}
	}
	
	public boolean checkDatabase(User user) {
		for (User userCheck : DatabaseSimulation.userData()) {
			if (user.getEmail().equals(userCheck.getEmail())) {
				System.out.println("bu  mail  sistemde mevcuttur .  +  baska bir mail kullanýnýz : " + user.getEmail());
				return false;
			}
		}
		return true;
	}
	

}
