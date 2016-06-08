package cls.qna.entity;

import mapper.qna.QnaCommentMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.QNAComment;

public class QnaCommentEntity implements intfc.qna.entity.QnaCommentEntity{

	@Override
	public boolean addQNAComment(QNAComment qnacomment) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			QnaCommentMapper qnaCommentMapper = sqlsession
					.getMapper(QnaCommentMapper.class);

			qnaCommentMapper.addQNAComment(qnacomment);
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
