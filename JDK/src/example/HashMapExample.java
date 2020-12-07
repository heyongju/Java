package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //홍길동 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));  //키로 값을 검색
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //Key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String Key = keyIterator.next();
			Integer value = map.get(Key);
			System.out.println("\t" + Key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //map.entrySet 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String Key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + Key + " : " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear(); //모든 map.entry 삭제
		System.out.println("총 Entry 수: " + map.size());
	}

}
