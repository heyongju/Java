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
		System.out.println("�� ��ü�� : " + size);
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) { //��ü ����ŭ ����
			String element = iterator.next(); //1���� ��ü�� ������
			System.out.println("\t" + element);
			System.out.println("\t" + iterator.hasNext());
			System.out.println();
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element); //��ü����ŭ ����
		}
		
		set.clear();  //��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {System.out.println("��� ����");}
		
	}

}
