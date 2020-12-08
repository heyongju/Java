package innerclass;


class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class myRunnable implements Runnable{
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200; //���������� ����� �ٲ�Ƿ� ���� ������ �� ���� ���� �߻�
				// i = 100; //�Ű������� ���� ����ó�� ����� �ٲ�Ƿ� ���� ������ �� ���� ���� �߻�
				
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(�ܺ�Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(�ܺ� Ŭ������ ���� ����)");
			}
		}
		return new myRunnable();
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10); //�ż��� ȣ��
		runner.run();

	}

}
