package collection.arrayList;
import collection.Member;
public class MemberArrayListTest {

	public static void main(String [] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member (1001, "이지원");
		Member memberSon = new Member (1002, "손민국");
		Member memberpark = new Member (1003, "박서현");
		Member memberHong = new Member (1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberpark);
		memberArrayList.addMember(memberSon);
		
		memberArrayList.showAllmember(); //전체 회원 출력
		
		memberArrayList.removeMember(memberHong.getMemberId()); //홍길동 멤버 삭제
		memberArrayList.showAllmember(); //홍길동 회원 삭제 후 다시 전체 회원 출력
	}
}
