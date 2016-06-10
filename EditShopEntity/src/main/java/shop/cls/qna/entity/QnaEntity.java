package shop.cls.qna.entity;

import mapper.qna.QnaMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import session.ShopSqlSessionFactory;
import shop.intfc.qna.entity.QnaEntityInter;
import vo.QNA;

@Repository
public class QnaEntity implements QnaEntityInter{

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
