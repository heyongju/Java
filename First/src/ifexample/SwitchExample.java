package ifexample;
import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("이동하실 층을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String[] store = {"약국", "정형외과", "피부과", "치과", "헬스 클럽"};
		int floor = scan.nextInt();
		switch(floor) {
		case 1: 
			System.out.println(floor + "층 " + store[0] + "입니다.");
			break;
			
		case 2: 
			System.out.println(floor + "층 " + store[1] + "입니다.");
			break;
			
		case 3: 
			System.out.println(floor + "층 " + store[2] + "입니다.");
			break;
		
		case 4: 
			System.out.println(floor + "층 " + store[3] + "입니다.");
			break;
			
		case 5: 
			System.out.println(floor + "층 " + store[4] + "입니다.");
			break;
		}


	}

}
