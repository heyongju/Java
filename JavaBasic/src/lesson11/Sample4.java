package lesson11;


class Car4{
	protected int num;
	protected double gas;
	
	public Car4() {
		num=0;
		gas=0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public Car4(int n, double g) {
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
class racingCar4 extends Car4{
	private int course;  //추가되는 필드
	
	public racingCar4() {
		course = 0;
		System.out.println("레이싱카가 만들어졌습니다.");
	}
	
	public racingCar4(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("코스번호가 " + c + "인 레이싱 카가 만들어 졌습니다.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("코스 번호를 " + course + "로 설정했습니다.");
	}
	
	@Override
	public void show() {
		System.out.println("레이싱카의 차량 번호는 " + num + "입니다.");
		System.out.println("레이싱카의 연료 양은 " + gas + "입니다.");
		System.out.println("코스 번호는 " + course + "입니다.");
	}
}
public class Sample4 {

	public static void main(String[] args) {
		racingCar4 rccar; 
		rccar = new racingCar4(1234, 20.5, 5);
		
		rccar.show();
		
	}

}
