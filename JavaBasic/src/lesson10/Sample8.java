package lesson10;

class Car1{
	private int num;
	private double gas;
	private String name;
	
	public Car1() {
		num = 0;
		gas = 0.0;
		name = "����";
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ���� ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void setname(String nm) {
		this.name = nm;
		System.out.println("���� �̸��� " + name + "(��)�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ���� " + gas+ "�Դϴ�.");
		System.out.println("�̸��� " + name + "�Դϴ�.");
	}
}


public class Sample8 {

	public static void main(String[] args) {
		Car1 car1;
		car1 = new Car1();
		car1.show();
		int number = 1234;
		double gasoline = 20.5;
		String str = "1ȣ��";
		
		car1.setCar(number, gasoline);
		car1.setname(str);
		
		car1.show();
	}

}
