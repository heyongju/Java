package lesson10;

class Car2{
	private int num;
	private double gas;
	
	public Car2() {
		num = 0;
		gas = 0d;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		this.num = n;
		this.gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ���� ����" + gas + "�� ��پ����ϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ���� " + gas + "�Դϴ�.");
	}
}

public class Smaple9 {

	public static void main(String[] args) {
		Car2[] cars;
		cars = new Car2[3];
		
		for(int i =0 ; i <cars.length; i++) {
			cars[i] = new Car2();
		}
		
		cars[0].setCar(1234, 20.5);
		cars[1].setCar(2345, 30.5);
		cars[2].setCar(3456, 40.5);
		
		for(Car2 car : cars) {
			car.show();
		}
	}

}

