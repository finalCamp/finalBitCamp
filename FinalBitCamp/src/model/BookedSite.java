package model;

import java.util.Date;

public class BookedSite {
	int num;
	int bookedSiteNum;
	String siteId;
	String sellerId;
	Date stayDay;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getBookedSiteNum() {
		return bookedSiteNum;
	}
	public void setBookedSiteNum(int bookedSiteNum) {
		this.bookedSiteNum = bookedSiteNum;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public Date getStayDay() {
		return stayDay;
	}
	public void setStayDay(Date stayDay) {
		this.stayDay = stayDay;
	}
	@Override
	public String toString() {
		return "BookedSite [num=" + num + ", bookedSiteNum=" + bookedSiteNum + ", siteId=" + siteId + ", sellerId="
				+ sellerId + ", stayDay=" + stayDay + "]";
	}
	
	
}
