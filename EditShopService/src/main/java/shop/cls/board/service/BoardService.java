package shop.cls.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cls.board.entity.BoardEntity;
import shop.intfc.board.service.BoardServiceInter;
import vo.Board;

@Service
public class BoardService implements BoardServiceInter {

	@Autowired
	BoardEntity boardEntity;

	
	@Override
	//0601 complete test
	public boolean addBoard(Board board) {

		return boardEntity.addBoard(board);
	}


	@Override
	//0601 complete test
	public boolean modyfiBoard(Board board) {
		return boardEntity.modifyBoard(board);
	}


	@Override
	//0601 complete test
	public boolean deleteBoard(int seq) {
		return boardEntity.deleteBoard(seq);
	}


	@Override
	public List<Board> searchBoard(Map<String, Object> param) {
		return boardEntity.searchBoard(param);
	}

}

