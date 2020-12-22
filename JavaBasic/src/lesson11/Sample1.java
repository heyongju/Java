package lesson11;

class Car{
	private int num;
	private double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
}

//레이싱카 클래스
class racingCar extends Car{
	private int course;  //추가되는 필드
	
	public racingCar() {
		course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "로 설정했습니다.");
	}
}
public class Sample1 {

	public static void main(String[] args) {
		racingCar rccar1;
		rccar1 = new racingCar();
		
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
	}

}
