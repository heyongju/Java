package sec02.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	Button.OnclickListener listener = new Button.OnclickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
			
		}
	};
	
	Window(){
		button1.setOnClickListner(listener);
		button2.setOnClickListner(new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
		
	}
}
