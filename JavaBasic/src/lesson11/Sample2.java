package lesson11;


class Car1{
	private int num;
	private double gas;
	
	public Car1() {
		num=0;
		gas=0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	public Car1(int n, double g) {
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
class racingCar1 extends Car1{
	private int course;  //�߰��Ǵ� �ʵ�
	
	public racingCar1() {
		course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public racingCar1(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("�ڽ���ȣ�� " + c + "�� ���̽� ī�� ����� �����ϴ�.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �����߽��ϴ�.");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		racingCar1 rccar1 = new racingCar1(1234, 20.5, 5);

	}

}
