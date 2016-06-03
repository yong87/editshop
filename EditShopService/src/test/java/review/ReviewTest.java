package review;

import org.junit.Test;

import cls.review.ReviewService;

public class ReviewTest {
	@Test
	public void reviewDelete(){
		ReviewService reviewService = new ReviewService();
		boolean b = reviewService.reviewDelete("1");
		System.out.println(b);
		
	}
	@Test
	public void reviewRevise(){
		ReviewService reviewService = new ReviewService();
		boolean b = reviewService.reviewRevise("cccasdwqsc", "find");
		System.out.println(b);
	}
	@Test
	public void reviewLike(){
		ReviewService reviewService = new ReviewService();
		boolean b= reviewService.reviewLike("1");
		System.out.println(b);
	}
	@Test
	public void reviewHate(){
		ReviewService reviewService = new ReviewService();
		boolean b= reviewService.reviewHate("1");
		System.out.println(b);
	}
}
