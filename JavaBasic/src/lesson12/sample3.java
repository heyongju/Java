package lesson12;


interface iVehicle{ //�������̽� ����
	void show();	//�߻� �޼ҵ�
}
//�ڵ��� Ŭ����
class Car1 implements iVehicle
{
	private int num; private double gas;
	public Car1(int n, double g) {
		num = n; gas = g;
		System.out.println("���� ��ȣ�� " + num + "�̸�, ���� ����" + gas + "�� �ڵ����� ����������ϴ�.");
	}
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}
//����� Ŭ����
class Plane1 implements iVehicle{
	private int flight;
	
	public Plane1(int f) {
		flight = f;
		System.out.println("����� ��ȣ��" + flight + "�� ����Ⱑ ����������ϴ�.");
	}

	public void show() {
		System.out.println("����� ��ȣ��" + flight + "�Դϴ�.");
	}
	
}

public class sample3{
	public static void main(String[] args) {
		iVehicle[] ivc;
		ivc = new iVehicle[2];
		
		ivc[0] = new Car1(1234, 20.5);
		
		ivc[1] = new Plane1(232);
		
		for(int i = 0; i<ivc.length; i++) {
			ivc[i].show();
		}
	}
}