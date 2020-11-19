package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money; // ¼öÀÔ Áõ°¡
		passengerCount ++; // ½Â°´ ¼ö Áõ°¡
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " ÃÑ ½Â°´Àº " + passengerCount + "¸íÀÌ°í, ¼öÀÔÀº " + money + "¿ø ÀÔ´Ï´Ù.");
	}
}
