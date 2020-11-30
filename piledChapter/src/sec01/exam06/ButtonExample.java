package sec01.exam06;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickLstener(new CallListener());
		btn.touch();
		
		btn.setOnClickLstener(new MessageListener());
		btn.touch();
	}
}
