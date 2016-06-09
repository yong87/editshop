package shop.intfc.review;

import java.util.List;

import vo.ReviewVo;

public interface ReviewServiceInter {
	public boolean reviewAdd(ReviewVo reviewVo);
	
	public boolean reviewDelete(String orderNumber);
	
	public boolean reviewRevise(String content, String userId);
	
	public boolean reviewLike(String orderNumber);
	
	public boolean reviewHate(String orderNumber);
	
	public boolean reviewAppraisal(String userId, int score);
	
	public List<ReviewVo> reviewView();
	
	public List<ReviewVo> reviewBestView();
	
	
}
