package shop.intfc.board.entity;

import java.util.List;
import java.util.Map;

import vo.Board;

public interface BoardEntityInter {

	public boolean addBoard(Board board);
	public boolean modifyBoard(Board board);
	public boolean deleteBoard(int seq);
	public List<Board> searchBoard(Map<String, Object> param);
}
