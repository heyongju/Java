package sec01.exam07;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("user1"); //������ �̸��� user1�� ����
		this.calculator = calculator; //���� ��ü�� calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calculator.setmemory(100);
	}

}
