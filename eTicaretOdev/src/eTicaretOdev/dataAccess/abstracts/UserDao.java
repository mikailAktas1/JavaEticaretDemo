package eTicaretOdev.dataAccess.abstracts;

import java.util.HashMap;

import eTicaretOdev.Entities.concretes.User;

public interface UserDao {
	void Add(User user);
	void Delete(User user);
	void Update(User user);
	HashMap<String, String> mailpass();
	void Add(User user, HashMap<String, String> mailpassHashMap);

}
