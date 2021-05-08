package eTicaretOdev;

import eTicaretOdev.Entities.concretes.User;
import eTicaretOdev.business.concretes.UserManager;
import eTicaretOdev.core.concretes.CheckRegister;
import eTicaretOdev.core.concretes.Login;
import eTicaretOdev.core.concretes.SendEmail;
import eTicaretOdev.dataAccess.concretes.HibernateLoginDao;
import eTicaretOdev.dataAccess.concretes.HibernateUserDao;

public class Manin {
	
	public static void main(String []args) {
		User user1 = new User();
		user1.setFirstName("Mikail");
		user1.setLastName("Aktaþ");
		user1.setEmail("013968@gmail.com");
		user1.setId(1);
		user1.setPassword("13168587");
		
		
		User user2 = new User();
		user2.setFirstName("Seda");
		user2.setLastName("Aktaþ");
		user2.setEmail("aktasseda@gmail.com");
		user2.setId(2);
		user2.setPassword("kngdkn");
		
		User user3 = new User();
		user3.setFirstName("Gönenç");
		user3.setLastName("Aktas");
		user3.setEmail("gönenc@gmail.com");
		user3.setId(3);
		user3.setPassword("19052021");
		
		Login trueLogin = new Login("013968@gmail.com" , "13168587");
		Login falseLogin = new Login("abc@gmail.com", "1234");
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new SendEmail(), 
				new CheckRegister(), new HibernateLoginDao());
		
		userManager.register(user1);
		System.out.println("----------------------");
		userManager.register(user2);
		System.out.println("----------------------");
		
		
	}

}
