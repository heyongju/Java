package lesson11;

class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	//레이싱카 클래스
	class racingCar extends Car{
		private int course;
		
		public racingCar() {
			course = 0;
			System.out.println("레이싱카가 만들어졌습니다.");
		}
	}
}
public class sample7 {

	public static void main(String[] args) {
		Car[] cars;
		cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new racingCar();
		
		for(int i =0; i<cars.length; i++) {
			Class c1 = cars[i].getClass();
			System.out.println((i+1) + "번째 객체의 클래스는 " + c1 + "입니다.");
		}
	}
}
