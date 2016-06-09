package paging;


public class Pagination {

	//한줄에 들어가는 아이템 수
	private int itemPerPage = 10;
	
	//뛰어 넘는 페이지의 수
	private int nextPage = 10;
	
	//페이지 변수
	private int page = 1;
	
	//총 아이템 수
	private int totalItemCount;

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
	
	/**
	 * 총 페이지의 갯수를 리턴
	 * @return
	 */
	public int getPageCount() {
		return (totalItemCount -1) / itemPerPage +1;
	}
	
	/**
	 * 페이지의 시작 위치
	 * @return
	 */
	public int getPageBegin() {
		return ((getCurrentPage() -1) / nextPage ) * nextPage+1;  
	}
	
	/**
	 * 페이지의 끝 위치
	 * @return
	 */
	public int getPageEnd() {
		int pageCount = getPageCount();
		int num = getPageBegin()+ nextPage-1; // 90 9 99
		return Math.min(pageCount, num);
	}
	
	public int getTotalItemCount() {
		return totalItemCount;
	}
	
	public void setTotalItemCount(int totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	
	public int getItemPerPage() {
		return itemPerPage;
	}
	
	public void setItemPerPage(int itemPerPage) {
		this.itemPerPage = itemPerPage;
	}
	
	public int getNextPage() {
		return nextPage;
	}
	
	public void setNextPage(int nextPage) {
		this.nextPage= nextPage;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	/**
	 * 현재 몇번째 아이템인지 리턴(mysql의 limit에서 사용)
	 * @return
	 */
	public int getCurrentItem() {
		return (page -1) * itemPerPage;
	}
	
	/**
	 * 다음페이지로 이동하는 메소드
	 * @return
	 */
	public int getJumpNextPage() {
		return Math.min(getPageCount(), page+nextPage);
	}
	
	/**
	 * 이전페이지로 이동하는 메소드
	 * @return
	 */
	public int getJumpPrePage() {
		return Math.max(1, page-nextPage);
	}
}
