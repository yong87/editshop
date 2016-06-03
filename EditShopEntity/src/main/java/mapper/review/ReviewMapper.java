package mapper.review;

import java.util.List;
import java.util.Map;

import vo.ReviewVo;

public interface ReviewMapper {
	public boolean reviewAdd(ReviewVo reviewVo);
	public boolean reviewDelete(String orderNumber);
	public boolean reviewRevise(Map<String, String> map);
	public boolean reviewLike(String orderNumber);
	public boolean reviewHate(String orderNumber);
	public boolean reviewAppraisal(Map map);
	public List<ReviewVo> reviewView();
	public List<ReviewVo> reviewBestView();
}
