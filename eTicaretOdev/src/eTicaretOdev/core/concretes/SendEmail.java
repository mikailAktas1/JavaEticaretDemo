package eTicaretOdev.core.concretes;

import eTicaretOdev.Entities.concretes.User;
import eTicaretOdev.core.abstracts.LoggerService;

public class SendEmail implements LoggerService {

	@Override
	public void sendEmail(User user) {
		System.out.println(" " + user.getEmail() + " mailine dogrulama linki gönderildi.");
	}

}