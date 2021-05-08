package eTicaretOdev.core.concretes;

import java.util.ArrayList;

import eTicaretOdev.Entities.concretes.User;


public class DatabaseSimulation {
public static ArrayList<User> userData() {
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User();
		user1.setFirstName("Mikail");
		user1.setLastName("Aktaþ");
		user1.setEmail("013968@gmail.com");
		user1.setId(1);
		user1.setPassword("13168587");
		users.add(user1);
		
		
		User user2 = new User();
		user2.setFirstName("Seda");
		user2.setLastName("Aktaþ");
		user2.setEmail("aktasseda@gmail.com");
		user2.setId(2);
		user2.setPassword("kngdkn");
		users.add(user2);
		
		User user3 = new User();
		user3.setFirstName("Gönenç");
		user3.setLastName("Aktas");
		user3.setEmail("gönenc@gmail.com");
		user3.setId(3);
		user3.setPassword("19052021");
		users.add(user3);
		return users;
		
		
		
		
		
		
	}

}
