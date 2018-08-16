package dao;

import java.util.Date;

import model.Member;

public interface MemberDao {
	
	public void insertMember(Member member);

	public void updateMember(Member member);

	public void deleteMember(String userId);

	public void selectMember(String userId);

	public void selectMemberAll(Date joinDate);

	public void selectNewMemberNum(Date joinDate);
	
}
