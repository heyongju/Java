package sec01.exam01;

import java.awt.Toolkit;

public class Beeptask implements Runnable{
	
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {} 
		}  //스레드 싱행 내용
	}

}
