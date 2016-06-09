package paging;

import java.util.HashMap;
import java.util.Map;

import mapper.page.PageMapper;

import org.apache.ibatis.session.SqlSession;

import session.ShopSqlSessionFactory;

public class PageScheduling {

	public Map<String, Integer> initSchedulingPage() {
		
		Map<String, Integer> init = new HashMap<String, Integer>();
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance().getSqlSession();
		
		try {
			PageMapper pageMapper = sqlsession.getMapper(PageMapper.class);
			
			init.put("board", pageMapper.getAllBoardCount());
			init.put("comment", pageMapper.getAllCommentCount());
			init.put("notice", pageMapper.getAllNoticeCount());
			init.put("product", pageMapper.getAllProductCount());
			init.put("qnaComment", pageMapper.getAllQNACommentCount());
			init.put("qna", pageMapper.getAllQNACount());
			init.put("review", pageMapper.getAllReviewCount());
			init.put("seller", pageMapper.getAllSellerCount());
			init.put("simpleProduct", pageMapper.getAllSimpleProductCount());
			init.put("user", pageMapper.getAllUserCount());
			
			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}
		return init;
		
	}
}
