package model;

import java.util.Date;

public class Booking {
	String userId;
	String siteId;
	String sellerId;
	String name;
	int bookingNum;
	int phone;
	int price;
	int statusType;
	Date chkIn;
	Date chkOut;
	Date cancel;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookingNum() {
		return bookingNum;
	}
	public void setBookingNum(int bookingNum) {
		this.bookingNum = bookingNum;
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
	public Date getCancel() {
		return cancel;
	}
	public void setCancel(Date cancel) {
		this.cancel = cancel;
	}
	@Override
	public String toString() {
		return "Booking [userId=" + userId + ", siteId=" + siteId + ", sellerId=" + sellerId + ", name=" + name
				+ ", bookingNum=" + bookingNum + ", phone=" + phone + ", price=" + price + ", statusType=" + statusType
				+ ", chkIn=" + chkIn + ", chkOut=" + chkOut + ", cancel=" + cancel + "]";
	}
	
}
