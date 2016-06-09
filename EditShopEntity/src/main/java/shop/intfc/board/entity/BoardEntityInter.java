package shop.intfc.board.entity;

import java.util.List;

import vo.Board;

public interface BoardEntityInter {

	public boolean addBoard(Board board);
	public boolean modifyBoard(Board board);
	public boolean deleteBoard(int seq);
	public List<Board> searchBoard(String key);
}
