package shop.intfc.board.service;

import java.util.List;

import vo.Board;

public interface BoardServiceInter {

	public boolean addBoard(Board board);
	public boolean modyfiBoard(Board board);
	public boolean deleteBoard(int seq);
	
	public List<Board> searchBoard(String key);
}
