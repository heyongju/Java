package example;

import java.util.*;

public class ArrauListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); //String°´Ã¼¸¦ ÀúÀå
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + size);
		System.out.println();
		String skill = list.get(2); //2¹ø ÀÎµ¦½ºÀÇ °´Ã¼ ¾ò±â (3¹øÂ° °´Ã¼)
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {//ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö¸¸Å­ ·çÇÎ
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); //2¹ø ÀÎµ¦½º °´Ã¼ »èÁ¦
		list.remove(2); //2¹ø ÀÎµ¦½º °´Ã¼ »èÁ¦
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
