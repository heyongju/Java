package lesson12;


interface iVehicle{ //�������̽� ����
	void Vshow();	//�߻� �޼ҵ�
}

interface iMaterial{
	void Mshow();
}
//�ڵ��� Ŭ����
class Car1 implements iVehicle, iMaterial
{
	private int num; private double gas;
	public Car1(int n, double g) {
		num = n; gas = g;
		System.out.println("���� ��ȣ�� " + num + "�̸�, ���� ����" + gas + "�� �ڵ����� ����������ϴ�.");
	}
	public void Vshow() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
	@Override
	public void Mshow() {
		System.out.println("�ڵ����� ������ ö�Դϴ�.");
	}
}


public class sample4{
	public static void main(String[] args) {
		Car1 car = new Car1(1234, 20.5);
		car.Vshow();
		car.Mshow();
		

	}
}