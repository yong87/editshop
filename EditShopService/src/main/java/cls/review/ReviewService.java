package cls.review;

import java.util.List;

import cls.review.entity.ReviewEntity;
import vo.ReviewVo;



public class ReviewService implements intfc.review.ReviewServiceInter {
	ReviewEntity review = new ReviewEntity();

	public boolean reviewAdd(ReviewVo reviewVo) {
		boolean bool = review.reviewAdd(reviewVo);
		return bool;
	}

	//0603 complete test
	public boolean reviewDelete(String orderNumber) {
		boolean bool = review.reviewDelete(orderNumber);
		return bool;
	}

	//0603 complete test
	public boolean reviewRevise(String content, String userId) {
		boolean bool = review.reviewRevise(content,userId);
		return bool;
	}

	//0603 complete test
	public boolean reviewLike(String orderNumber) {
		boolean bool = review.reviewLike(orderNumber);
		return bool;
	}

	//0603 complete test
	public boolean reviewHate(String orderNumber) {
		boolean bool = review.reviewHate(orderNumber);
		return bool;
	}

	
	public boolean reviewAppraisal(String userId, int score) {
		boolean bool = review.reviewAppraisal(userId, score);
		return bool;
	}

	
	public List<ReviewVo> reviewView() {
		List<ReviewVo> list = review.reviewView();
		return list;
	}

	
	public List<ReviewVo> reviewBestView() {
		List<ReviewVo> list = review.reviewBestView();
		return list;
	}

}
