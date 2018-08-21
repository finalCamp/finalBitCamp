package dao;

import java.util.Map;

import model.Camp;

public interface CampDao {
	
	public void insertCamp(Camp camp);

	public void updateCamp(Camp camp);

	public void deleteCamp(String campId);

	public void selectCamp(String campId, String siteId);

	public void selectCampAll(Map<String, Object>map);

}
