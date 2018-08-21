package controller;

import java.util.Date;

import service.SiteServiceImpl;

public class SiteController {
	
	SiteServiceImpl sService = new SiteServiceImpl();

	public void addSite(String campId, String campSiteName, String content, String siteId, int campSiteStock, int campPerson, int busyDayPrice, int busyWkndPrice, int dayPrice, int wkndPrice, Date startBusyDate, Date endBusyDate){

	}

	public void updateSite(String campId, String campSiteName, String content, String siteId, int campSiteStock, int campPerson, int busyDayPrice, int busyWkndPrice, int dayPrice, int wkndPrice, Date startBusyDate, Date endBusyDate){

	}

	public void deleteSite(String siteId){

	}

	public void getSite(String siteId, String campId){

	}
}
