package service;

import java.util.List;

import model.Member;

public interface MemberService {
	
	public int insertMember(Member member);
	
	public int insertMemberSns(Member member);
	
	public int updateMember(Member member);
	
	public int deleteMember(String userId);
	
	public Member selectMember(String userId);
	
	public List<Member> selectMemberAll(int joinDate);
	
	public int selectNewMemberNum(int joinDate);
}
