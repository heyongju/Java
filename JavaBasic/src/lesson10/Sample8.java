package lesson10;

class Car1{
	private int num;
	private double gas;
	private String name;
	
	public Car1() {
		num = 0;
		gas = 0.0;
		name = "무명";
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
	}
	
	public void setname(String nm) {
		this.name = nm;
		System.out.println("차량 이름을 " + name + "(으)로 바꾸었습니다.");
	}
	
	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연로 양은 " + gas+ "입니다.");
		System.out.println("이름은 " + name + "입니다.");
	}
}


public class Sample8 {

	public static void main(String[] args) {
		Car1 car1;
		car1 = new Car1();
		car1.show();
		int number = 1234;
		double gasoline = 20.5;
		String str = "1호차";
		
		car1.setCar(number, gasoline);
		car1.setname(str);
		
		car1.show();
	}

}
