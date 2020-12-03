package sec02.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		thread.interrupt(); //스레드를 종료하기 위해 InterruptException을 발생시킴
	}

}
