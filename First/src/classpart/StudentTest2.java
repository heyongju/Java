package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentID = "12-72010668";
		student1.studentName = "�ȿ���";
		student1.address = "��õ������ ����Ȧ��";
		student1.grade = 100;

		Student student2 = new Student();
		student2.studentName = "�Ƚ¿�";

		System.out.println(student1.studentID +"/"+ student1.studentName + "/" + student1.address + "/" + student1.grade);
		System.out.println(student2);
	}

}
