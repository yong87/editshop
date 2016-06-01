package cls.board.service;

import java.util.List;

import intfc.board.entity.BoardEntity;
import vo.Board;

public class BoardService implements intfc.board.service.BoardService {

	BoardEntity boardEntity = new cls.board.entity.BoardEntity();

	
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
	public List<Board> searchBoard(String title) {
		return boardEntity.searchBoard(title);
	}

}

