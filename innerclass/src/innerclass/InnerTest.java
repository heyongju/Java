package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass; //���� Ŭ���� �ڷ��� ������ ���� ����
	
	static class InStaticClass{ //���� ���� Ŭ����
		int inNum = 100; 		//���� ���� Ŭ������ �ν��Ͻ� ����
		static int sInNum = 200;// ���� ���� Ŭ������ ���� ����
		
	void inTest() { //���� ���� Ŭ������ �Ϲ� �޼���
		//num +=10; //�ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����. ***
		System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���");
		System.out.println("InStaticClass SInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		System.out.println("OutClass sNum = " + sNum + "(�ܺ�Ŭ������ ���� ���� ���)");
	}
	
	static void sTest() {
		//num += 10;
		//inNum += 10; //�ܺ�Ŭ������ ���� Ŭ������ �ν��Ͻ� ������ ����� �� �����Ƿ� �ּ� ó��
		System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
	}
}
	

	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 20; //�ν��Ͻ� ���� Ŭ������ ���� ���� ���� �Ұ���.
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
			}
	}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main (String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();//���� Ŭ���� ���ȣ��
		System.out.println();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //�ܺ� Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ���� ���� ����
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
	}
}

