package sec02.exam02;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printTread = new PrintThread1();
		printTread.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		
		printTread.setStop(true);

	}

}
