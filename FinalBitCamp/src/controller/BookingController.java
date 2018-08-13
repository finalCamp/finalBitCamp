package controller;

import java.util.Date;

public class BookingController {
	
	public void newBooking(String userId, String siteId, String name, String sellerId, int phone, int price, int statusTyep, int bookingNum, Date chkIn, Date chkOut, boolean status) {
		
	}
	
	public void updateBooking(String userId, String siteId, String name, String sellerId, int phone, int price, int statusTyep, int bookingNum, Date chkIn, Date chkOut, boolean status) {
		
	}
	
	public void cancelBooking(int bookingNum) {
		
	}
	
	public void getBookingInfo(int bookingNum) {
		
	}
	
	public void getMyBookingList(String userId) {
		
	}
	
	public void getBookingList(String userId, String sellerId, Date startDate, Date endDate) {
		
	}
	
	public void getBookingNum(Date startDate, Date endDate, int statusType, String sellerId) {
		
	}
	
	public void getBookingPrice(Date startDate, Date endDate, int statusType, String sellerId) {
		
	}
	
	public void getReturnNum(Date startDate, Date endDate, int statusType, String sellerId) {
		
	}
	
	public void getReturnPrice(Date startDate, Date endDate, int statusType, String sellerId) {
		
	}
}
