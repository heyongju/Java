package lesson15;


class Car extends Thread{

	private String name;
	
	public Car(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name + "�� �����ϰ� �ֽ��ϴ�.");
		}
	}
}
public class Sample2 {

	public static void main(String[] args) {
		Car car1 = new Car("1ȣ��");
		car1.start();
		
		Car car2 = new Car("2ȣ��");
		car2.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("main() �޼ҵ� �������Դϴ�.");
		}
	}

}
