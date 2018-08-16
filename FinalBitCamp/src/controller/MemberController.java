package controller;

import java.util.Date;

import service.MemberService;

public class MemberController {
	
	MemberService mService = new MemberService();

	public void joinMember(String userid, String pw, String pwChk, String name, String email, String addr, 
			int phone, int post){

	}

	public void updateMember(String userid, String pw, String pwChk, String name, String email, String addr, 
			int phone, int post){

	}

	public void getMember(String userId){

	}

	public void leaveMember(String userId, String pw){

	}

	public void loginMember(String userId, String pw){

	}

	public void logoutMember(){

	}

	public void getMemberList(Date joinDate){

	}

	public void getNewMemberNum(Date joinDate){

	}
}
