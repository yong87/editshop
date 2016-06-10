package board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.board.service.BoardService;
import vo.Board;

public class boardtest {

	private BoardService bs;
	
	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        bs = ac.getBean("boardService", BoardService.class);
    }
	
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
		
		Map<String, Object> param = new HashMap<String, Object>();
		
		List<Board> list = bs.searchBoard(param);
		
		for(Board temp : list) {
			System.out.println(temp);
		}
	}
}
