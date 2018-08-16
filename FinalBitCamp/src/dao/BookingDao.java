package dao;

import java.util.Date;

import model.Booking;

public interface BookingDao {
	
	public void insertBooking(Booking booking);

	public void updateBooking(Booking booking);

	public void selectBooking(int bookingNum);

	public void selectBookingAll(String userId, String sellerId, Date startDate, Date endDate);

	public void selectBookingNum(String userId, String sellerId, Date startDate, Date endDate, int statusType);

	public void selectBookingPrice(String userId, String sellerId, Date startDate, Date endDate, int statusType);

}
