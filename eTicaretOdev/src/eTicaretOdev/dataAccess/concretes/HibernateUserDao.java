package eTicaretOdev.dataAccess.concretes;

import java.util.HashMap;

import eTicaretOdev.Entities.concretes.User;
import eTicaretOdev.dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {
	
	

	
	@Override
	public void Add(User user, HashMap<String, String> mailpassHashMap) {
		System.out.println("Hibernate ile eklendi : "  + user.getEmail());
		
		mailpassHashMap.put(user.getEmail(), user.getPassword());
	}

	@Override
	public void Delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, String> mailpass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Add(User user) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


