package lesson12;

abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("�ӵ��� " + speed + "(��)�� �����߽��ϴ�.");
	}
	abstract void show(); //�߻� �޼ҵ� show()
}
//�ڵ��� Ŭ����
class Car extends Vehicle{
	
	private int num;
	private double gas;
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ " + num + ", ���� �� " + gas + "�� �ڵ����� ����������ϴ�.");
	}
	@Override
	void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
		System.out.println("�ӵ���" + speed+ "�Դϴ�.");
	}
}

//����� Ŭ����
class Plane extends Vehicle{
	private int flight;
	
	public Plane(int f) {
		flight = f;
		System.out.println("����� ��ȣ�� " + flight + "�� ����Ⱑ ����������ϴ�.");
	}
	@Override
	void show() {
		System.out.println("����� ��ȣ�� " + flight + "�Դϴ�.");
		System.out.println("�ӵ��� " + speed+ "�Դϴ�.");
	}
	
}
public class sample1 {

	public static void main(String[] args) {
		
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5);
		vc[0].setSpeed(60);
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i=0; i<vc.length; i++) {
			vc[i].show();
		}
	}

}
