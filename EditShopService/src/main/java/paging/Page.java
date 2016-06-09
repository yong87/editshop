package paging;

import java.util.HashMap;
import java.util.Map;

public class Page {

	//페이지당 아이템 갯수
	private int itemPerPage = 10;
	
	//페이지 변수
	private int page = 1;
	
	//총 아이템 수
	private int totalItemCount;
	
	public Page(int flag) {
		switch (flag) {
		case 1:
			
			break;

		default:
			break;
		}
	}

	public int getItemPerPage() {
		return itemPerPage;
	}

	public void setItemPerPage(int itemPerPage) {
		this.itemPerPage = itemPerPage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalItemCount() {
		return totalItemCount;
	}

	public void setTotalItemCount(int totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	
	/**
	 * 총 페이지 갯수 리턴
	 * @return
	 */
	public int getPageCount() {
		return (totalItemCount -1) / itemPerPage +1;
	}

	/**
	 * 현재 위치한 페이지의 위치를 리턴
	 * @return
	 */
	public int getCurrentPage() {
		
		int page = this.page;
		
		if (page < 1) {
			page = 1;
		}
		
		int pageCount = getPageCount();
		
		if(page > pageCount) {
			page = pageCount;
		}
		
		return page;
	}
	
	public Map<String, Integer> getPaging(int page, int itemPerPage) {
		this.page = page;
		this.itemPerPage = itemPerPage;
		
		Map<String, Integer> paging = new HashMap<String, Integer>();
		//itemperpage = 10;
		// 1 - 0-9
		// 2- 10-19
		// 3- 20-29
		
		paging.put("start", (page-1) * itemPerPage);
		paging.put("end", page * itemPerPage -1);
		
		return paging;
	}
}
