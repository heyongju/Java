package collection.arrayList;

import java.util.ArrayList;
import collection.Member; // MemberŬ������  collection ��Ű���� �����Ƿ� ����Ϸ��� import �ؾ���.

public class MemberArrayList {
	private ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member); //ArrayList�� ȸ���� �߰��ϴ� �޼���
	}
	
	public boolean removeMember(int memberId) {
		for(int i= 0; i< arrayList.size(); i++) {
			Member member = arrayList.get(i); // get() �޼���� ȸ���� ���������� ������
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}//�ش� ���̵� ���� ȸ���� ArrayList���� ã�� ������. 
	
	public void showAllmember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}//��ü ȸ���� ����ϴ� �޼���
}
