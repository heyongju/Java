package sec01.exam01;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new Beeptask();
		Thread thread = new Thread(beepTask);
		thread.start(); //Beeptask�� run�� ����
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
