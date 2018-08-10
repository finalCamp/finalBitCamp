package model;

import java.util.Date;

public class Member {
	String userId;
	String pw;
	String name;
	String email;
	String addr;
	int phone;
	int post;
	boolean admin;
	Date joinDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", pw=" + pw + ", name=" + name + ", email=" + email + ", addr=" + addr
				+ ", phone=" + phone + ", post=" + post + ", admin=" + admin + ", joinDate=" + joinDate + "]";
	}	
}
