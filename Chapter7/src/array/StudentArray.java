package array;

public class StudentArray {

	public static void main(String[] args) {
		Student[] student =  new Student[3];
		
		student[0] = new Student("James");
		student[1] = new Student("TOMAS");
		student[2] = new Student("Yong");

		for (int i = 0; i < student.length; i++) {
			student[i].showStudentInfo();
		}
	}

}
