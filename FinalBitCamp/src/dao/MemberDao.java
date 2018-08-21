package dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import model.Member;

public interface MemberDao {
	
	public int insertMember(Member member);
	
	public int insertMemberSns(Member member);

	public int updateMember(Member member);

	public int deleteMember(String userId);

	public Member selectMember(String userId);

	public List<Member> selectMemberAll(int joinDate);

	public int selectNewMemberNum(int joinDate);
	
}
