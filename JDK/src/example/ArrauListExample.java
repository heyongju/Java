package example;

import java.util.*;

public class ArrauListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); //String��ü�� ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü�� : " + size);
		System.out.println();
		String skill = list.get(2); //2�� �ε����� ��ü ��� (3��° ��ü)
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {//����� �� ��ü ����ŭ ����
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); //2�� �ε��� ��ü ����
		list.remove(2); //2�� �ε��� ��ü ����
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
