package sec02.exam01;

public class Car {
	//�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü Ÿ��
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	//�������̽����� ����� roll()�޼��� ȣ��
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
