package lesson8;

class Car{
	int num;
	double gas;
	void setNumGas(int n, double g) {
		num = n; gas = g;
		System.out.println("���� ��ȣ��" + num + "����, ���� ����" + gas + "�� �ٲپ����ϴ�." );
	}
	
	void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}

public class SampleP2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNumGas(1234, 20.5);
		car1.show();
	}
}
