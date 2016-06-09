package shop.cls.board.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mapper.board.BoardMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import session.ShopSqlSessionFactory;
import shop.intfc.board.entity.BoardEntityInter;
import vo.Board;

@Repository
public class BoardEntity implements BoardEntityInter {

	@Override
	public boolean addBoard(Board board) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
			boardMapper.addBoard(board);
			
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
	public boolean modifyBoard(Board board) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
			boardMapper.modifyBoard(board);
			
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
	public boolean deleteBoard(int seq) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
			boardMapper.deleteBoard(seq);
			
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
	public List<Board> searchBoard(Map<String, Object> param) {
		
		List<Board> list = new ArrayList<Board>();
		
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			BoardMapper boardMapper = sqlsession.getMapper(BoardMapper.class);
			list = boardMapper.searchBoard(param);
			
			sqlsession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}
		return list;
	
	}
}

