package intfc.user;

import java.text.ParseException;

import vo.User;

public interface UserAdminService {

	
	public String Login(String id, String password);
	public boolean LogOut(String id);
	public boolean exitUser(String id, String password);
	public boolean addUser(String id, String password, String email) throws ParseException;
	public boolean addDetailUser(User user);
}
