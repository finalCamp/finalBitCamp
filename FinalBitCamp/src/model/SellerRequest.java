package model;

public class SellerRequest {
	int businessNum;
	int campPhone;
	int campPost;
	String campName;
	String campOwner;
	String campAddr;
	String sellerId;
	String result;
	boolean grant;
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
	public String getCampName() {
		return campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public boolean isGrant() {
		return grant;
	}
	public void setGrant(boolean grant) {
		this.grant = grant;
	}
	@Override
	public String toString() {
		return "SellerRequest [businessNum=" + businessNum + ", campPhone=" + campPhone + ", campPost=" + campPost
				+ ", campName=" + campName + ", campOwner=" + campOwner + ", campAddr=" + campAddr + ", sellerId="
				+ sellerId + ", result=" + result + ", grant=" + grant + "]";
	}
		
}
