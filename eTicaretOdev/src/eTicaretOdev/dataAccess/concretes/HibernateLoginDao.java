package eTicaretOdev.dataAccess.concretes;

import eTicaretOdev.Entities.concretes.User;
import eTicaretOdev.core.concretes.DatabaseSimulation;
import eTicaretOdev.core.concretes.Login;
import eTicaretOdev.dataAccess.abstracts.LoginDao;

public class HibernateLoginDao  implements LoginDao{

	@Override
	public void checkLogin(Login login) {
		
			for(User userCheck: DatabaseSimulation.userData()) {
				if(login.getEmail().equals(userCheck.getEmail())) {
					if (login.getPassword().equals(userCheck.getPassword())) {
						System.out.println("Sisteme giris yapýldý");
						break;
					}
				} else {
					System.out.println("Lütfen mail ve sifrenizi kontrol ediniz!");
					break;
				}
			}
			
		}
		
	}


