package eTicaretOdev.business.abstracts;

import eTicaretOdev.Entities.concretes.User;

public interface UserService {

	void login(User User);
	void register(User user);
}
