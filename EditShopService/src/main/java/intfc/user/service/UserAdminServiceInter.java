package intfc.user.service;

import java.text.ParseException;
import java.util.Map;

import vo.User;

public interface UserAdminServiceInter {

	
	public Map<String, Object> Login(String id, String password);
	public boolean LogOut(String id);
	public boolean exitUser(String id, String password);
	public boolean addUser(String id, String password, String email) throws ParseException;
	public boolean addDetailUser(User user);
	public boolean existUser(String id);
}