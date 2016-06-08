package mapper.seller;

import vo.Seller;
import vo.SellerLang;

public interface SellerAddMapper {

	public boolean addSeller(Seller seller);
	public boolean addDefalutSellerInKor(String id);
	public boolean addDefalutSellerInJpn(String id);
	public boolean addDefalutSellerInChn(String id);
	public boolean addDefalutSellerInEng(String id);
	
	public boolean updateKr(SellerLang sellerLang);
	public boolean updateEn(SellerLang sellerLang);
	public boolean updateCn(SellerLang sellerLang);
	public boolean updateJp(SellerLang sellerLang);
	
}
