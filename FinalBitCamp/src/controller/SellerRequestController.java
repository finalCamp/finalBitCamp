package controller;

import service.SellerRequestService;

public class SellerRequestController {
	
	SellerRequestService srService = new SellerRequestService();

	public void joinSellerRequest(String userId, String businessName, String campOwner, String campAddr, String sellerId,
			int businessNum, int campPhone, int campPost){

	}

	public void updateSellerRequest(String userId, String businessName, String campOwner, String campAddr, String sellerId, 
			int businessNum, int campPhone, int campPost){

	}

	public void cancelSellerRequest(String sellerId){

	}

	public void getSellerRequest(String sellerId){

	}

	public void getSellerRequestList(){

	}

	public void getSellerRequestResult(String sellerId){

	}
}
