package shop.intfc.user.service;

import java.text.ParseException;
import java.util.Map;

import vo.User;
import vo.UserDetail;

public interface UserAdminServiceInter {

	
	public Map<String, Object> login(String id, String password);
	public boolean logOut(String id);
	public boolean exitUser(String id, String password);
	public boolean addUser(String id, String password, String email) throws ParseException;
	public boolean reSendMail(String id) throws ParseException;
	public boolean addDetailUser(User user);
	public boolean existUser(String id);
	public boolean findUser(Map<String, Object> find);
	public User getUserInfo(String userId);
	public boolean changePwd(User user);
	public boolean modifyUserDetail(UserDetail detail);
}
