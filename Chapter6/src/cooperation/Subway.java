package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money; // 수입 증가
		passengerCount ++; // 승객 수 증가
	}
	
	public void showInfo() {
		System.out.println("승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
