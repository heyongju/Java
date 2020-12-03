package sec02.exam05;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autosavethread = new AutoSaveThread();
		autosavethread.setDaemon(true);
		autosavethread.start();
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {}
		System.out.println("메인 스레드 종료");
	}
	
}
