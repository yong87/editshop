package cls.user;

import intfc.user.entity.UserAddEntity;
import intfc.user.entity.UserAdminEntity;
import vo.User;

public class UserAdminService implements intfc.user.UserAdminService {

	UserAdminEntity userAd = new cls.user.entity.UserAdminEntity();
	UserAddEntity userAdd = new cls.user.entity.UserAddEntity();

	 //0530/1434 complete test
	public String Login(String id, String password) {

		String encrypted = userAd.getPasswordById(id);

		if (!encrypted.equals(password.trim())) {
		}

		userAd.checkLastVisitTime(id);
		userAd.addVisitCount(id);
		
		
		return userAd.returnLanguage(id);
	}


	//0530/1437 complete test
	public boolean LogOut(String id) {
		return userAd.addExitTime(id);
	}

	//0530/1450 complete test
	public boolean exitUser(String id, String password) {
		if(!password.equals(userAd.getPasswordById(id))) {
			return false;
		}
		return userAd.changeAuthority(id, 0);
	}

	
	public boolean addUser(User user) {
		return userAdd.addDefalutUser(user.getId(), user.getPassword());
	}

	 
	public boolean addDetailUser(User user) {
		return userAdd.addDetailUser(user.getUserDetail());
	}
}
