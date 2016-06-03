package comment;

import org.junit.Test;

import vo.Comment;
import cls.comment.entity.CommentEntity;

public class commentTest {

	CommentEntity ce = new CommentEntity();
	
	@Test
	public void searchidTest() {
		System.out.println(ce.searchCommentBySeq(31));
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