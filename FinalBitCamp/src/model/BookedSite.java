package model;

import java.util.Date;

public class BookedSite {
	int num;
	int siteId;
	String sellerId;
	int bookedSiteNum;
	Date stayDay;
	
	
	@Override
	public String toString() {
		return "BookedSite [num=" + num + ", siteId=" + siteId + ", sellerId=" + sellerId + ", bookedSiteNum="
				+ bookedSiteNum + ", stayDay=" + stayDay + "]";
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getSiteId() {
		return siteId;
	}


	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}


	public String getSellerId() {
		return sellerId;
	}


	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}


	public int getBookedSiteNum() {
		return bookedSiteNum;
	}


	public void setBookedSiteNum(int bookedSiteNum) {
		this.bookedSiteNum = bookedSiteNum;
	}


	public Date getStayDay() {
		return stayDay;
	}


	public void setStayDay(Date stayDay) {
		this.stayDay = stayDay;
	}
	
	
	
	
	
}
