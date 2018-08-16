package model;

import java.util.Date;

public class Site {
	String siteId;
	String campId;
	String campSiteName;
	String content;
	int campSiteStock;
	int campPerson;
	int busyDayPrice;
	int busyWkndPrice;
	int dayPrice;
	int wkndPrice;
	Date startBusyDate;
	Date endBusyDate;
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getCampId() {
		return campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampSiteName() {
		return campSiteName;
	}
	public void setCampSiteName(String campSiteName) {
		this.campSiteName = campSiteName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCampSiteStock() {
		return campSiteStock;
	}
	public void setCampSiteStock(int campSiteStock) {
		this.campSiteStock = campSiteStock;
	}
	public int getCampPerson() {
		return campPerson;
	}
	public void setCampPerson(int campPerson) {
		this.campPerson = campPerson;
	}
	public int getBusyDayPrice() {
		return busyDayPrice;
	}
	public void setBusyDayPrice(int busyDayPrice) {
		this.busyDayPrice = busyDayPrice;
	}
	public int getBusyWkndPrice() {
		return busyWkndPrice;
	}
	public void setBusyWkndPrice(int busyWkndPrice) {
		this.busyWkndPrice = busyWkndPrice;
	}
	public int getDayPrice() {
		return dayPrice;
	}
	public void setDayPrice(int dayPrice) {
		this.dayPrice = dayPrice;
	}
	public int getWkndPrice() {
		return wkndPrice;
	}
	public void setWkndPrice(int wkndPrice) {
		this.wkndPrice = wkndPrice;
	}
	public Date getStartBusyDate() {
		return startBusyDate;
	}
	public void setStartBusyDate(Date startBusyDate) {
		this.startBusyDate = startBusyDate;
	}
	public Date getEndBusyDate() {
		return endBusyDate;
	}
	public void setEndBusyDate(Date endBusyDate) {
		this.endBusyDate = endBusyDate;
	}
	@Override
	public String toString() {
		return "Site [siteId=" + siteId + ", campId=" + campId + ", campSiteName=" + campSiteName + ", content="
				+ content + ", campSiteStock=" + campSiteStock + ", campPerson=" + campPerson + ", busyDayPrice="
				+ busyDayPrice + ", busyWkndPrice=" + busyWkndPrice + ", dayPrice=" + dayPrice + ", wkndPrice="
				+ wkndPrice + ", startBusyDate=" + startBusyDate + ", endBusyDate=" + endBusyDate + "]";
	}
	
	
}
