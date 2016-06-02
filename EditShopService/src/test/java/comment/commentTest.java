package comment;

import java.util.List;

import org.junit.Test;

import vo.Comment;
import cls.comment.service.CommentService;

public class commentTest {

	CommentService cs = new CommentService();
	
	@Test
	public void addCommentTest(){
		Comment cm = new Comment();
		
		cm.setId("test");
		cm.setBoardSeq(2);
		cm.setContent("testtest1");
		
		System.out.println(cs.addComment(cm));
	}
	
	@Test
	public void modyfiCommentTest() {
		
		Comment cm = new Comment();
		cm.setCommentSeq(4);
		cm.setContent("mody3");
		
		System.out.println(cs.modyfiComment(cm));
	}
	
	@Test
	public void deleteCommentTest() {
		System.out.println(cs.deleteComment(8));
	}
	
	@Test
	public void searchTest() {
		List<Comment> list = cs.searchComment("o");
		
		for(Comment cm : list) {
			System.out.println(cm);
		}
	}
	
	@Test
	public void addreco() {
		Comment co = new Comment();
		
		co.setId("test");
		co.setBoardSeq(2);
		co.setContent("레벨2");
		co.setLevel(3);
		co.setStep(2);
		co.setRef(5);
		
		System.out.println(cs.addReComment(32, co));
	
	}
	
}
