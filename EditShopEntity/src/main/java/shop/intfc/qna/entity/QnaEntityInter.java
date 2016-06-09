package shop.intfc.qna.entity;

import vo.QNA;

public interface QnaEntityInter {

	public boolean addQNA(QNA qna);
	public boolean modifyQNA(QNA qna);
	
	public boolean deleteQNA(int seq);
}
