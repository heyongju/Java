package sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.Field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new RemoteControl() {        //�Ű���
					
					@Override
					public void turnOn() {
						System.out.println("Smart TV�� �մϴ�.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("Smart TV�� ���ϴ�.");
					}
				}
			);
	}

}
