package model;

public class MyCamp {
	int num;
	String userId;
	String campId;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCampId() {
		return campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}
	@Override
	public String toString() {
		return "MyCamp [num=" + num + ", userId=" + userId + ", campId=" + campId + "]";
	}
	
	
}
