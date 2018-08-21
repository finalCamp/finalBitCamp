package model;

import java.util.Date;

public class Booking {
	int bookingNum;
	String userId;
	int siteId;
	String sellerId;
	Date chkIn;
	Date chkOut;
	String name;
	int phone;
	int price;
	int statusType;
	Date cancelDate;
	
	
	@Override
	public String toString() {
		return "Booking [bookingNum=" + bookingNum + ", userId=" + userId + ", siteId=" + siteId + ", sellerId="
				+ sellerId + ", chkIn=" + chkIn + ", chkOut=" + chkOut + ", name=" + name + ", phone=" + phone
				+ ", price=" + price + ", statusType=" + statusType + ", cancelDate=" + cancelDate + "]";
	}


	public int getBookingNum() {
		return bookingNum;
	}


	public void setBookingNum(int bookingNum) {
		this.bookingNum = bookingNum;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
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


	public Date getChkIn() {
		return chkIn;
	}


	public void setChkIn(Date chkIn) {
		this.chkIn = chkIn;
	}


	public Date getChkOut() {
		return chkOut;
	}


	public void setChkOut(Date chkOut) {
		this.chkOut = chkOut;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getStatusType() {
		return statusType;
	}


	public void setStatusType(int statusType) {
		this.statusType = statusType;
	}


	public Date getCancelDate() {
		return cancelDate;
	}


	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	
	
	
	
}
