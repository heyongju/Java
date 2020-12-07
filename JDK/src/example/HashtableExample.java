package example;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("autumn", "1234");
		map.put("winter", "12345"); //���̵�� ��й�ȣ�� �̸� ����
		
		Scanner scanner = new Scanner(System.in); //Ű����κ��� �Էµ� ������ �ޱ� ���� ����
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�: ");
			String id = scanner.nextLine(); //Ű����� �Է��� ���̵� ����
			System.out.print("��й�ȣ: ");
			String password = scanner.nextLine(); //Ű����� �Է��� ���ι�ȣ�� ����
					
			if(map.containsKey(id)) {
				if(map.containsValue(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� Ȯ�����ּ���.");
				}
			}else {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
			}
			System.out.println();
		}
	}

}
