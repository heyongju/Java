package array;
import java.util.ArrayList;


public class Student2 {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList �����ϱ�
	
	public Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s: subjectList) {
			total += s.getScorePoint(); // ���� ���ϱ�
			System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " + s.getScorePoint() + "�� �Դϴ�.");
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + "�� �Դϴ�.");
	}
}