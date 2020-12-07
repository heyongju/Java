package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{
	private int memberId; //회원 아이디
	private String memberName;// 회원 이름
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int hashCode() {
		return memberId; //hashCode() 메서드가 회원 아이디를 반한하도록 재정의
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId() {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}


}
