package cls.user.entity;

import intfc.user.entity.UserLogEntityInter;
import mapper.user.UserLogMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;

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
