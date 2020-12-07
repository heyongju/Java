package collection;

public class Member implements Comparable<Member>{
	private int memberId; //회원 아이디
	private String memberName;// 회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int hashCode() {
		return memberId; //hashCode() 메서드가 회원 아이디를 반한하도록 재정의
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId) * -1;
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
