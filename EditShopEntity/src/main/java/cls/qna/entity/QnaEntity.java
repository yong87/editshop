package cls.qna.entity;

import mapper.qna.QnaMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.QNA;

public class QnaEntity implements intfc.qna.entity.QnaEntity{

	@Override
	public boolean addQNA(QNA qna) {

		
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			QnaMapper qnaMapper = sqlsession
					.getMapper(QnaMapper.class);

			qnaMapper.addQNA(qna);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
		
	}

	@Override
	public boolean modifyQNA(QNA qna) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			QnaMapper qnaMapper = sqlsession
					.getMapper(QnaMapper.class);

			qnaMapper.modifyQNA(qna);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
		
	}

	@Override
	public boolean deleteQNA(int seq) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			QnaMapper qnaMapper = sqlsession
					.getMapper(QnaMapper.class);

			qnaMapper.deleteQNA(seq);
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
