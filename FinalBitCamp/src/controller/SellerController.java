package controller;

import java.util.Date;

import service.SellerService;

public class SellerController {
	
	SellerService sService = new SellerService();

	public void joinSeller(String userId, String businessName, String campOwner, String campAddr, String sellerId, int businessNum, int campPhone, int campPost){

	}

	public void updateSeller(String userId, String businessName, String campOwner, String campAddr, String sellerId, int businessNum, int campPhone, int campPost){

	}

	public void leaveSeller(String sellerId, String pw){

	}

	public void deleteSeller(String userId){

	}

	public void getSeller(String sellerId){

	}

	public void getSellerList(Date joinDate){

	}

	public void stopSeller(String sellerId, Date stopDate){

	}

	public void getSellerNum(Date joinDate){

	}
}
