package model;

public class Camp {
	String campId;
	String campName;
	String campPolicy;
	String campNotice;
	String sellerId;
	public String getCampId() {
		return campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampName() {
		return campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}
	public String getCampPolicy() {
		return campPolicy;
	}
	public void setCampPolicy(String campPolicy) {
		this.campPolicy = campPolicy;
	}
	public String getCampNotice() {
		return campNotice;
	}
	public void setCampNotice(String campNotice) {
		this.campNotice = campNotice;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	@Override
	public String toString() {
		return "Camp [campId=" + campId + ", campName=" + campName + ", campPolicy=" + campPolicy + ", campNotice="
				+ campNotice + ", sellerId=" + sellerId + "]";
	}
	
}
