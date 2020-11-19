package array;



public class Student {
	private String studentName;
	public int studentID;
	private static int serialNum = 1000;
	

	public Student(String studentName) {
		serialNum ++;
		studentID = serialNum;
		this.studentName = studentName;
	}
	
	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + studentName);
	}
	
	
	
}
