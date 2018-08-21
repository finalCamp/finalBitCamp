package dao;

import model.Site;

public interface SiteDao {
	
	public void insertSite(Site site);

	public void updateSite(Site site);

	public void deleteSite(String siteId);

	public void selectSite(String siteId, String campId);

}
