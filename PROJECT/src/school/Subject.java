package school;

import java.util.ArrayList;
import utils.Define; //���α׷� ���ݿ��� ����ϴ� ���Ŭ����

public class Subject {

	private String subjectName; //�����̸�
	private int subjectId; //���� ���� ��ȣ
	private int gradeType; //���� �� ��å
	
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

	public void register(Student student) {//������û �޼���
		studentList.add(student);
	}
	
}