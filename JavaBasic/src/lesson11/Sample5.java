package lesson11;


class Car5{
	protected int num;
	protected double gas;
	
	public Car5() {
		num=0;
		gas=0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ���� ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public String toString() {
		String str = "���� ��ȣ: " + num + " ���� ��: " + gas;
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
