package cooperation;

public class Taxi {

	int money;
	
	
	public void take(int money) {
		this.money += money;
	}

	public void showInfo() {
		System.out.println("�ý� ������ " + money + "�� �Դϴ�.");
	}
}

