package lesson11;


class Car4{
	protected int num;
	protected double gas;
	
	public Car4() {
		num=0;
		gas=0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	public Car4(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "�̸�, ���� ���� " + gas + "�� �ڵ����� ����������ϴ�.");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ���� ���� " + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ���� " + gas + "�Դϴ�.");
	}
}

//���̽�ī Ŭ����
class racingCar4 extends Car4{
	private int course;  //�߰��Ǵ� �ʵ�
	
	public racingCar4() {
		course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public racingCar4(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("�ڽ���ȣ�� " + c + "�� ���̽� ī�� ����� �����ϴ�.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �����߽��ϴ�.");
	}
	
	@Override
	public void show() {
		System.out.println("���̽�ī�� ���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���̽�ī�� ���� ���� " + gas + "�Դϴ�.");
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}
}
public class Sample4 {

	public static void main(String[] args) {
		racingCar4 rccar; 
		rccar = new racingCar4(1234, 20.5, 5);
		
		rccar.show();
		
	}

}
