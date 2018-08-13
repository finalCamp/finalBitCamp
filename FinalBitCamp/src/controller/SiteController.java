package controller;

import java.util.Date;

import service.SiteService;

public class SiteController {
	
	SiteService sService = new SiteService();

	public void addSite(String campId, String campSiteName, String content, String siteId, int campSiteStock, int campPerson, int busyDayPrice, int busyWkndPrice, int dayPrice, int wkndPrice, Date startBusyDate, Date endBusyDate){

	}

	public void updateSite(String campId, String campSiteName, String content, String siteId, int campSiteStock, int campPerson, int busyDayPrice, int busyWkndPrice, int dayPrice, int wkndPrice, Date startBusyDate, Date endBusyDate){

	}

	public void deleteSite(String siteId){

	}

	public void getSite(String siteId, String campId){

	}
}
