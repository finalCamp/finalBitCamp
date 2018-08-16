package model;

import java.util.Date;

public class Mileage {
	int num;
	int mileage;
	String userId;
	Date startDate;
	Date endDate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Mileage [num=" + num + ", mileage=" + mileage + ", userId=" + userId + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
}
