package lesson11;

class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
}
public class sample6 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		Car car3;
		car3 = car1;
		
		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);
		
		System.out.println("car1�� car2�� ������ ������ ���, " + bl1 + "�����ϴ�.");
		System.out.println("car1�� car3�� ������ ������ ���, " + bl2 + "�����ϴ�.");
	}

}
