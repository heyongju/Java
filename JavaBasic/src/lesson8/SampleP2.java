package lesson8;

class Car{
	int num;
	double gas;
	void setNumGas(int n, double g) {
		num = n; gas = g;
		System.out.println("차량 번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다." );
	}
	
	void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

public class SampleP2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNumGas(1234, 20.5);
		car1.show();
	}
}
