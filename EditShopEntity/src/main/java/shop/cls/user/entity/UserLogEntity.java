package shop.cls.user.entity;

import mapper.user.UserLogMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import session.ShopSqlSessionFactory;
import shop.intfc.user.entity.UserLogEntityInter;

@Repository
public class UserLogEntity implements UserLogEntityInter {

	public boolean modifyLog(String id) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance().getSqlSession();

		try {
			UserLogMapper userLogMapper = sqlsession.getMapper(UserLogMapper.class);
			userLogMapper.modifyLog(id);

			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

}
