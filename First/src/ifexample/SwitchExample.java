package ifexample;
import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("�̵��Ͻ� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String[] store = {"�౹", "�����ܰ�", "�Ǻΰ�", "ġ��", "�ｺ Ŭ��"};
		int floor = scan.nextInt();
		switch(floor) {
		case 1: 
			System.out.println(floor + "�� " + store[0] + "�Դϴ�.");
			break;
			
		case 2: 
			System.out.println(floor + "�� " + store[1] + "�Դϴ�.");
			break;
			
		case 3: 
			System.out.println(floor + "�� " + store[2] + "�Դϴ�.");
			break;
		
		case 4: 
			System.out.println(floor + "�� " + store[3] + "�Դϴ�.");
			break;
			
		case 5: 
			System.out.println(floor + "�� " + store[4] + "�Դϴ�.");
			break;
		}


	}

}
