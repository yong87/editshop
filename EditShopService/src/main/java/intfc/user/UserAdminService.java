package intfc.user;

import vo.User;

public interface UserAdminService {

	
	public String Login(String id, String password);
	public boolean LogOut(String id);
	public boolean exitUser(String id, String password);
	public boolean addUser(User user);
	public boolean addDetailUser(User user);
}
