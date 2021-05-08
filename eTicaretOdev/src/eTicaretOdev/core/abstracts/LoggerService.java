package eTicaretOdev.core.abstracts;

import eTicaretOdev.Entities.concretes.User;

public interface LoggerService {
	
	void sendEmail(User user);

}
