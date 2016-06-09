package mapper.seller;

import java.util.List;
import java.util.Map;

import vo.Seller;
import vo.SellerLang;

public interface SellerAddMapper {

	public boolean addSeller(Seller seller);
	public boolean addDefalutSellerInKor(String id);
	public boolean addDefalutSellerInJpn(String id);
	public boolean addDefalutSellerInChn(String id);
	public boolean addDefalutSellerInEng(String id);
	
	public List<Seller> getAllSeller(Map<String, Integer> param);
	public Seller getSellerById(String id);
	public List<Seller> getSellerKRByStoreName(Map<String, Integer> param);
	public List<Seller> getSellerJPByStoreName(Map<String, Integer> param);
	public List<Seller> getSellerENByStoreName(Map<String, Integer> param);
	public List<Seller> getSellerCHByStoreName(Map<String, Integer> param);
	
	public List<Seller> getSellerKRByAddress(Map<String, Integer> param);
	public List<Seller> getSellerJPByAddress(Map<String, Integer> param);
	public List<Seller> getSellerENByAddress(Map<String, Integer> param);
	public List<Seller> getSellerCNByAddress(Map<String, Integer> param);

	public boolean updateKr(SellerLang sellerLang);
	public boolean updateEn(SellerLang sellerLang);
	public boolean updateCn(SellerLang sellerLang);
	public boolean updateJp(SellerLang sellerLang);

	public List<Seller> getSellerByStatus(Map<String, Integer> param);
}
