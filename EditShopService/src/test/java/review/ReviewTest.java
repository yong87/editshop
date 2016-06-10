package review;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.review.ReviewService;

public class ReviewTest {
	
	private ReviewService reviewService;
	
	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        reviewService = ac.getBean("reviewService", ReviewService.class);
    }
	
	@Test
	public void reviewDelete(){
		
		boolean b = reviewService.reviewDelete("1");
		System.out.println(b);
		
	}
	@Test
	public void reviewRevise(){
		
		boolean b = reviewService.reviewRevise("cccasdwqsc", "find");
		System.out.println(b);
	}
	@Test
	public void reviewLike(){
		
		boolean b= reviewService.reviewLike("1");
		System.out.println(b);
	}
	@Test
	public void reviewHate(){
		
		boolean b= reviewService.reviewHate("1");
		System.out.println(b);
	}
}
