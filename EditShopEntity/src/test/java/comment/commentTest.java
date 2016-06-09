package comment;

import org.junit.Test;

import shop.cls.comment.entity.CommentEntity;
import vo.Comment;

public class commentTest {

	CommentEntity ce = new CommentEntity();
	
	@Test
	public void searchidTest() {
		
	}
	
	@Test
	public void changeLevel() {
		Comment co = new Comment();
		
		co.setCommentSeq(11);
		co.setLevel(4);
		System.out.println(ce.changeLevel(co));
	}
	
	@Test
	public void addreco() {
		Comment co = new Comment();
		
		co.setId("test");
		co.setBoardSeq(2);
		co.setContent("content");
		co.setLevel(3);
		co.setStep(2);
		co.setRef(5);
		
		System.out.println(ce.addReComment(co));
	
	}
}
