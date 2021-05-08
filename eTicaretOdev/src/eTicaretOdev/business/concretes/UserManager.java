package eTicaretOdev.business.concretes;

import eTicaretOdev.Entities.concretes.User;
import eTicaretOdev.business.abstracts.UserService;
import eTicaretOdev.core.abstracts.LoggerService;
import eTicaretOdev.core.concretes.CheckRegister;
import eTicaretOdev.core.concretes.Login;
import eTicaretOdev.dataAccess.abstracts.LoginDao;
import eTicaretOdev.dataAccess.abstracts.UserDao;

public class  UserManager implements UserService {
	
	private UserDao userDao;
	private LoggerService loggerService;
	private CheckRegister checkRegister;
	private LoginDao loginDao;
	private Login login;

	

	public UserManager(UserDao userDao, LoggerService loggerService, CheckRegister checkRegister, LoginDao loginDao) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
		this.checkRegister = checkRegister;
		this.loginDao = loginDao;
		this.login = login;
	}




	@Override
	public void register(User user) {
		if(checkRegister.checkEmail(user)) {
			userDao.Add(user);
			loggerService.sendEmail(user);
		}
		}
		
		
		
		
	
	
	@Override
	public void login(User User) {
		
		loginDao.checkLogin(login);
		
	}

	
}
