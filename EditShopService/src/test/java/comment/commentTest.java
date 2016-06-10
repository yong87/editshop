package comment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.comment.service.CommentService;
import vo.Comment;

public class commentTest {

	@Autowired
	private CommentService cs;
	
	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        cs = ac.getBean("commentService", CommentService.class);
    }
	
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
		
		Map<String, Object> param = new HashMap<String, Object>();
		
		List<Comment> list = cs.searchComment(param);
		
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
