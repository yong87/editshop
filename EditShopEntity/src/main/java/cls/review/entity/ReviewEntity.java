package cls.review.entity;

import intfc.review.entity.ReviewEntityInter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mapper.review.ReviewMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;
import vo.ReviewVo;



public class ReviewEntity implements ReviewEntityInter {

	
	public boolean reviewAdd(ReviewVo reviewVo) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			reviewMapper.reviewAdd(reviewVo);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	
	public boolean reviewDelete(String orderNumber) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			reviewMapper.reviewDelete(orderNumber);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	
	public boolean reviewRevise(String content, String userId) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("content", content);
		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			reviewMapper.reviewRevise(map);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	
	public boolean reviewLike(String orderNumber) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			reviewMapper.reviewLike(orderNumber);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	
	public boolean reviewHate(String orderNumber) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			reviewMapper.reviewHate(orderNumber);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	
	public boolean reviewAppraisal(String userId, int score) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		Map map = new HashMap();
		map.put("userId", userId);
		map.put("score", score);

		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			reviewMapper.reviewAppraisal(map);
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	
	public List<ReviewVo> reviewView() {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		List<ReviewVo> list = new ArrayList<ReviewVo>();
		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			list = reviewMapper.reviewView();
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			sqlsession.close();
		}
		return list;
	}

	
	public List<ReviewVo> reviewBestView() {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		List<ReviewVo> list = new ArrayList<ReviewVo>();
		try {
			ReviewMapper reviewMapper = sqlsession
					.getMapper(ReviewMapper.class);
			list = reviewMapper.reviewBestView();
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			sqlsession.close();
		}
		return list;
	}
	
	
}
