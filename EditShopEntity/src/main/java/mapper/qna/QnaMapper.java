package mapper.qna;

import vo.QNA;

public interface QnaMapper {

	public boolean addQNA(QNA qna);
	public boolean modifyQNA(QNA qna);
	
	public boolean deleteQNA(int seq);
}
