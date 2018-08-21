package model;

public class MyCamp {
	int num;
	String userId;
	int campId;
	
	
	@Override
	public String toString() {
		return "MyCamp [num=" + num + ", userId=" + userId + ", campId=" + campId + "]";
	}
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
	public int getCampId() {
		return campId;
	}
	public void setCampId(int campId) {
		this.campId = campId;
	}
	
	
	
	
}
