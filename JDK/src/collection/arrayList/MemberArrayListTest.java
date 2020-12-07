package collection.arrayList;
import collection.Member;
public class MemberArrayListTest {

	public static void main(String [] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member (1001, "������");
		Member memberSon = new Member (1002, "�չα�");
		Member memberpark = new Member (1003, "�ڼ���");
		Member memberHong = new Member (1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberpark);
		memberArrayList.addMember(memberSon);
		
		memberArrayList.showAllmember(); //��ü ȸ�� ���
		
		memberArrayList.removeMember(memberHong.getMemberId()); //ȫ�浿 ��� ����
		memberArrayList.showAllmember(); //ȫ�浿 ȸ�� ���� �� �ٽ� ��ü ȸ�� ���
	}
}
