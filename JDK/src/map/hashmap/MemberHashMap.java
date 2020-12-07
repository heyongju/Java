package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); //key-value 쌍으로 추가, HashMap에 회원을 추가하는 메서드
		}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true; //해당 회원 삭제
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { //다음 key가 있으면
			int key = ir.next(); //key값을 가져와서
			Member member = hashMap.get(key); //key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
