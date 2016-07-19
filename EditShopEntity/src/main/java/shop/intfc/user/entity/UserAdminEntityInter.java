package shop.intfc.user.entity;

import java.util.List;
import java.util.Map;

import vo.User;
import vo.UserDetail;
import vo.UserInfo;

public interface UserAdminEntityInter {

	public Map<String, Object> getPasswordById(String id);

	public boolean changeAuthority(String id, int authority);

	public boolean checkLastVisitTime(String id);

	public boolean addVisitCount(String id);

	public boolean addExitTime(String id);

	public List<UserDetail> getAllUserDetail(Map<String, Integer> param);

	public UserDetail getUserDetailById(String id);

	public UserInfo getUserInfoById(String id);
	
	public String returnLanguage(String id);
	
	public List<UserDetail> getUserDetailByEmail(String email);

	public boolean modifyUserPwd(User user);
	
	public boolean modifyUserDetail(UserDetail detail);
}
