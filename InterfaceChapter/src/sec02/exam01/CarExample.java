package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("-----타이어교체-----");
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire= new KumhoTire();
		
		myCar.run();

	}

}
