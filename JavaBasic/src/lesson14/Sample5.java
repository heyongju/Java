package lesson14;


class CarExceptioon extends Exception{
	
}
//�ڵ��� Ŭ����
class Car{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) throws CarExceptioon{
		if(g<0) {
			CarExceptioon e = new CarExceptioon();
			throw e;
		}
		else {
			num = n; gas = g;
			System.out.println("���� ��ȣ�� " + num + "����, ���� ���� " + gas + "�� �ٲپ����ϴ�.");
		}
	}
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}
public class Sample5 {

	public static void main(String[] args) {
		Car car1 = new Car();
		try {
			car1.setCar(1234, -10d);
		}catch(CarExceptioon e) {
			System.out.println(e + "(��)�� ���������ϴ�.");
		}
		car1.show();
	}
}
