package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import model.Camp;
import service.CampService;

@Controller
public class CampController {
	
	@Autowired
	private CampService cService;
	
	public void getCamp() {
		Camp camp = cService.getCamp(1);
		System.out.println(camp.toString());
	}

}
