package example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { //객체 수만큼 루핑
			String element = iterator.next(); //1개의 객체를 가져옴
			System.out.println("\t" + element);
			System.out.println("\t" + iterator.hasNext());
			System.out.println();
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element); //객체수만큼 루핑
		}
		
		set.clear();  //모든 객체를 제거하고 비움
		if(set.isEmpty()) {System.out.println("비어 있음");}
		
	}

}
