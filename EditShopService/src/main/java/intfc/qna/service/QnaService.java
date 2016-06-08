package intfc.qna.service;

import vo.QNA;

public interface QnaService {

	public boolean addQNA(QNA qna);
	public boolean modifyQNA(QNA qna);
	
	public boolean deleteQNA(int seq);
}
