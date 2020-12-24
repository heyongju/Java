package lesson12;


interface iVehicle{ //인터페이스 선언
	void Vshow();	//추상 메소드
}

interface iMaterial{
	void Mshow();
}
//자동차 클래스
class Car1 implements iVehicle, iMaterial
{
	private int num; private double gas;
	public Car1(int n, double g) {
		num = n; gas = g;
		System.out.println("차량 번호가 " + num + "이며, 연료 양이" + gas + "인 자동차가 만들어졌습니다.");
	}
	public void Vshow() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
	@Override
	public void Mshow() {
		System.out.println("자동차의 재질은 철입니다.");
	}
}


public class sample4{
	public static void main(String[] args) {
		Car1 car = new Car1(1234, 20.5);
		car.Vshow();
		car.Mshow();
		

	}
}