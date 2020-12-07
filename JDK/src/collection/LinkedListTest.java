package collection;

import java.util.LinkedList;
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D"); //��ũ�� ����Ʈ�� ù ��° ��ġ�� D�߰�
		System.out.println(myList);
		
		myList.addFirst("O"); //���� ����Ʈ�� �� �տ� O�߰�
		System.out.println(myList);
		
		System.out.println(myList.removeLast());  //������ ��Ҹ� ���� �� �ش� ��Ҹ� ���
		System.out.println(myList);

	}

}
