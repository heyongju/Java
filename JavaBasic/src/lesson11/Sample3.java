package lesson11;


class Car2{
	protected int num;
	protected double gas;
	
	public Car2() {
		num=0;
		gas=0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	public Car2(int n, double g) {
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
class racingCar2 extends Car2{
	private int course;  //�߰��Ǵ� �ʵ�
	
	public racingCar2() {
		course = 0;
		System.out.println("���̽�ī�� ����������ϴ�.");
	}
	
	public racingCar2(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("�ڽ���ȣ�� " + c + "�� ���̽� ī�� ����� �����ϴ�.");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("�ڽ� ��ȣ�� " + course + "�� �����߽��ϴ�.");
	}
	
	public void newshow() {
		System.out.println("���̽�ī�� ���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���̽�ī�� ���� ���� " + gas + "�Դϴ�.");
		System.out.println("�ڽ� ��ȣ�� " + course + "�Դϴ�.");
	}
}
public class Sample3 {

	public static void main(String[] args) {
		racingCar2 rccar2; 
		rccar2 = new racingCar2();
		
		rccar2.newshow();
		
	}

}
