package collection;

import java.util.LinkedList;
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D"); //링크드 리스트의 첫 번째 위치에 D추가
		System.out.println(myList);
		
		myList.addFirst("O"); //연결 리스트의 맨 앞에 O추가
		System.out.println(myList);
		
		System.out.println(myList.removeLast());  //마짐가 요소를 제거 후 해당 요소를 출력
		System.out.println(myList);

	}

}
