package school;

import java.util.ArrayList;
import utils.Define; //프로그램 전반에서 사용하는 상수클래스

public class Subject {

	private String subjectName; //과목이름
	private int subjectId; //과목 고유 번호
	private int gradeType; //학점 평가 정책
	
	private ArrayList<Student> StudentList = new ArrayList<Student>();
	
	public Subject (String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return StudentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		StudentList = studentList;
	}

	public void register(Student student) {//수강신청 메서드
		studentList.add(student);
	}
	
}
