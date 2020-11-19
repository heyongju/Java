package staticex;

public class Student3 {
	private static int serialNum;
	private static int cardNum;
	public int studentID;
	public String studentName;
	
	
	Student3(){
		serialNum ++;
		cardNum = serialNum+100;
		studentID = serialNum;
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setcardNum(int cardNum) {
		Student3.cardNum = cardNum;
	}
	
	public static int getcardNum() {
		return cardNum;
	}

}