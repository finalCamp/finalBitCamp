package dao;

import java.util.Date;

import model.Mileage;

public interface MileageDao {
	
	public void insertMileage(Mileage mileage);

	public void updateMileage(Mileage mileage);

	public void deleteMileage(String userId, Date startDate);

	public void selectMileagePoint(String userId, Date date);

	public void selectMileage(int num);

	public void selectMileageAll(String userId);

}
