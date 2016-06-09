package board;

import org.junit.Test;

import shop.cls.board.entity.BoardEntity;
import vo.Board;

public class BoardTest {

	BoardEntity be = new BoardEntity();
	
	@Test
	public void addBoard() {
		
		Board board = new Board();
		
		board.setContent("content");
		board.setFile("file");
		board.setFlag("fla");
		board.setId("test");
		board.setTitle("title");
		
		be.addBoard(board);
	}
}
