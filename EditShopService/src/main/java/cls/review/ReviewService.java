package cls.review;

import java.util.List;

import cls.review.entity.ReviewEntity;
import vo.ReviewVo;



public class ReviewService implements intfc.review.ReviewService {
	ReviewEntity review = new ReviewEntity();
	@Override
	public boolean reviewAdd(ReviewVo reviewVo) {
		boolean bool = review.reviewAdd(reviewVo);
		return bool;
	}

	@Override
	public boolean reviewDelete(String orderNumber) {
		boolean bool = review.reviewDelete(orderNumber);
		return bool;
	}

	@Override
	public boolean reviewRevise(ReviewVo reviewVo) {
		boolean bool = review.reviewRevise(reviewVo);
		return bool;
	}

	@Override
	public boolean reviewLike(String orderNumber) {
		boolean bool = review.reviewLike(orderNumber);
		return bool;
	}

	@Override
	public boolean reviewHate(String orderNumber) {
		boolean bool = review.reviewHate(orderNumber);
		return bool;
	}

	@Override
	public boolean reviewAppraisal(String userId, int score) {
		boolean bool = review.reviewAppraisal(userId, score);
		return bool;
	}

	@Override
	public List<ReviewVo> reviewView() {
		List<ReviewVo> list = review.reviewView();
		return list;
	}

	@Override
	public List<ReviewVo> reviewBestView() {
		List<ReviewVo> list = review.reviewBestView();
		return list;
	}

}
