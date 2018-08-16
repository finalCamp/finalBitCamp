package controller;

import java.util.Date;

import service.CampService;

public class CampController {
	
	CampService cService = new CampService();
	
	public void addCamp(String campPolicy, String campNotice, String sellerId, String campId ) {
		
	}
	
	public void updateCamp(String campPolicy, String campNotice, String sellerId, String campId ) {
		
	}
	
	public void deleteCamp(String campId) {
		
	}
	
	public void getCamp(String campId, String siteId) {
		
	}
	
	public void getCampList(Date chkIn, Date chkOut, String campAddr, String campName, int campPerson, 
			boolean campToilet, boolean campShower) {
		
	}
}
