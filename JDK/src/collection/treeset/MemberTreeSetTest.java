package collection.treeset;

import collection.Member;
public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLEE= new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		
		memberTreeSet.addMember(memberLEE);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();

	}

}
