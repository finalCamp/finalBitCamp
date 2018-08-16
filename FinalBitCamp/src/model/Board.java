package model;

import java.util.Date;

public class Board {
	int num;
	int originNo;
	int groupOrd;
	int groupLayer;
	int contentType;
	int rate;
	int headType;
	String writer;
	String title;
	String content;
	String sellerId;
	Date date;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getOriginNo() {
		return originNo;
	}
	public void setOriginNo(int originNo) {
		this.originNo = originNo;
	}
	public int getGroupOrd() {
		return groupOrd;
	}
	public void setGroupOrd(int groupOrd) {
		this.groupOrd = groupOrd;
	}
	public int getGroupLayer() {
		return groupLayer;
	}
	public void setGroupLayer(int groupLayer) {
		this.groupLayer = groupLayer;
	}
	public int getContentType() {
		return contentType;
	}
	public void setContentType(int contentType) {
		this.contentType = contentType;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHeadType() {
		return headType;
	}
	public void setHeadType(int headType) {
		this.headType = headType;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [num=" + num + ", originNo=" + originNo + ", groupOrd=" + groupOrd + ", groupLayer=" + groupLayer
				+ ", contentType=" + contentType + ", rate=" + rate + ", headType=" + headType + ", writer=" + writer
				+ ", title=" + title + ", content=" + content + ", sellerId=" + sellerId + ", date=" + date + "]";
	}
	
}
