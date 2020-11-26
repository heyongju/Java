package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone();   추상클래스 만드는 것이 안됨.
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

	}

}
