package cls.comment.entity;

import intfc.comment.entity.CommentEntityInter;

import java.util.ArrayList;
import java.util.List;

import mapper.comment.CommentMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.Comment;

public class CommentEntity implements CommentEntityInter {

	@Override
	public boolean addComment(Comment comment) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			CommentMapper commentMapper = sqlsession
					.getMapper(CommentMapper.class);
			commentMapper.addComment(comment);
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
	public boolean modyfiComment(Comment comment) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			CommentMapper commentMapper = sqlsession
					.getMapper(CommentMapper.class);
			commentMapper.modyfiComment(comment);
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
	public boolean deleteComment(int commentSeq) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			CommentMapper commentMapper = sqlsession
					.getMapper(CommentMapper.class);
			commentMapper.deleteComment(commentSeq);
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
	public List<Comment> searchComment(String content) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		List<Comment> list = new ArrayList<Comment>();
		try {
			CommentMapper commentMapper = sqlsession
					.getMapper(CommentMapper.class);
			list = commentMapper.searchComment(content);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}

		return list;
	}

	@Override
	public List<Comment> searchCommentBySeq(int commentSeq) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		List<Comment> list = new ArrayList<Comment>();
		try {
			CommentMapper commentMapper = sqlsession
					.getMapper(CommentMapper.class);
			list = commentMapper.searchCommentBySeq(commentSeq);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}

		return list;
	}

	@Override
	public boolean changeLevel(Comment comment) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			CommentMapper commentMapper = sqlsession
					.getMapper(CommentMapper.class);
			commentMapper.changeLevel(comment);
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
	public boolean addReComment(Comment comment) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			CommentMapper commentMapper = sqlsession
					.getMapper(CommentMapper.class);
			commentMapper.addReComment(comment);
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
