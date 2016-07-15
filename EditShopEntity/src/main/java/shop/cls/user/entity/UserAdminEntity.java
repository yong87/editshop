package shop.cls.user.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mapper.user.UserAdministrationMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import session.ShopSqlSessionFactory;
import shop.intfc.user.entity.UserAdminEntityInter;
import vo.UserDetail;
import vo.UserInfo;

@Repository
public class UserAdminEntity implements UserAdminEntityInter {

	public Map<String, Object> getPasswordById(String id) {
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			returnMap.put("password", userAdministrationMapper.getPasswordById(id));
			returnMap.put("status", getStatusById(id, sqlsession));
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}
		return returnMap;
	}
	
	private int getStatusById(String id, SqlSession sqlsession) {

		int status = 0;
		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
				
			status = userAdministrationMapper.getStatusById(id);

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			sqlsession.close();
		}
		return status;
	}

	public boolean changeAuthority(String id, int authority) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		param.put("authority", authority);

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			userAdministrationMapper.changeAuthority(param);

			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	// 수정중
	public boolean checkLastVisitTime(String id) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			userAdministrationMapper.checkLastVisitTime(id);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	public boolean addVisitCount(String id) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			userAdministrationMapper.addVisitCount(id);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	public boolean addExitTime(String id) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			userAdministrationMapper.addExitTime(id);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	public List<UserDetail> getAllUserDetail(Map<String, Integer> param) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		List<UserDetail> resultList = new ArrayList<UserDetail>();

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			resultList = userAdministrationMapper.getAllUserDetail(param);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return resultList;
	}

	public UserInfo getUserInfoById(String id) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		UserInfo userInfo = new UserInfo();
		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			userInfo = userAdministrationMapper.getUserInfoById(id);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return userInfo;
	}

	public UserDetail getUserDetailById(String id) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		UserDetail userDetail = new UserDetail();

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			userDetail = userAdministrationMapper.getUserDetailById(id);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return userDetail;

	}

	public String returnLanguage(String id) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		String resultLanguage = null;

		try {
			UserAdministrationMapper userAdministrationMapper = sqlsession
					.getMapper(UserAdministrationMapper.class);
			resultLanguage = userAdministrationMapper.returnLanguage(id);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return resultLanguage;
	}

	@Override
	public List<UserDetail> getUserDetailByEmail(String email) {
		// TODO Auto-generated method stub
		SqlSession session = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<UserDetail> user = null;
		try{
			UserAdministrationMapper mapper = session.getMapper(UserAdministrationMapper.class);
			user = mapper.getUserDetailByEmail(email);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return user;
	}

}
