package lesson11;


class Car2{
	protected int num;
	protected double gas;
	
	public Car2() {
		num=0;
		gas=0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public Car2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호가 " + num + "이며, 연료 양이 " + gas + "인 자동차가 만들어졌습니다.");
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
class racingCar2 extends Car2{
	private int course;  //추가되는 필드
	
	public racingCar2() {
		course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public racingCar2(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("코스번호가 " + c + "인 레이싱 카가 만들어 졌습니다.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "로 설정했습니다.");
	}
	
	public void newshow() {
		System.out.println("레이싱카의 차량 번호는 " + num + "입니다.");
		System.out.println("레이싱카의 연료 양은 " + gas + "입니다.");
		System.out.println("코스 번호는 " + course + "입니다.");
	}
}
public class Sample3 {

	public static void main(String[] args) {
		racingCar2 rccar2; 
		rccar2 = new racingCar2();
		
		rccar2.newshow();
		
	}

}
