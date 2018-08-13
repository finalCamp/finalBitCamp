package model;

import java.util.Date;

public class Seller {
	int businessNum;
	int campPhone;
	int campPost;
	String businessName;
	String campOwner;
	String campAddr;
	String sellerId;
	boolean status;
	Date joinDate;
	Date stopDate;
	public int getBusinessNum() {
		return businessNum;
	}
	public void setBusinessNum(int businessNum) {
		this.businessNum = businessNum;
	}
	public int getCampPhone() {
		return campPhone;
	}
	public void setCampPhone(int campPhone) {
		this.campPhone = campPhone;
	}
	public int getCampPost() {
		return campPost;
	}
	public void setCampPost(int campPost) {
		this.campPost = campPost;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getCampOwner() {
		return campOwner;
	}
	public void setCampOwner(String campOwner) {
		this.campOwner = campOwner;
	}
	public String getCampAddr() {
		return campAddr;
	}
	public void setCampAddr(String campAddr) {
		this.campAddr = campAddr;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getStopDate() {
		return stopDate;
	}
	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}
	@Override
	public String toString() {
		return "Seller [businessNum=" + businessNum + ", campPhone=" + campPhone + ", campPost=" + campPost
				+ ", businessName=" + businessName + ", campOwner=" + campOwner + ", campAddr=" + campAddr
				+ ", sellerId=" + sellerId + ", status=" + status + ", joinDate=" + joinDate + ", stopDate=" + stopDate
				+ "]";
	}
	
}
