package board;

import java.util.List;

import org.junit.Test;

import cls.board.service.BoardService;
import vo.Board;

public class boardtest {

	BoardService bs = new BoardService();

	@Test
	public void addBoard() {

		Board board = new Board();

		board.setContent("content");
		board.setFile("file");
		board.setFlag("fla");
		board.setId("test3");
		board.setTitle("title");

		bs.addBoard(board);
	}

	@Test
	public void modytest() {
		Board board = new Board();

		board.setId("test");
		board.setContent("content1");
		board.setFile("file1");
		board.setTitle("title1");
		board.setSeq(2);
		
		bs.modyfiBoard(board);
	}
	
	@Test
	public void delTest() {
		System.out.println(bs.deleteBoard(3));
	}
	
	@Test
	public void search() {
		List<Board> list = bs.searchBoard("content1");
		
		for(Board temp : list) {
			System.out.println(temp);
		}
	}
}
