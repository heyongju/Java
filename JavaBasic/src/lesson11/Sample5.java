package lesson11;


class Car5{
	protected int num;
	protected double gas;
	
	public Car5() {
		num=0;
		gas=0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public String toString() {
		String str = "차량 번호: " + num + " 연료 양: " + gas;
		return str;
	}
}

public class Sample5 {

	public static void main(String[] args) {
		Car5 car = new Car5();
		car.setCar(1234, 20.5);
		
		System.out.println(car);
		
	}

}
