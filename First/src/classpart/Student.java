package classpart;

public class Student {


		String studentID;
		String studentName;
		int grade;
		String address;
		
		public String getStudentName() {
			return studentName;
		}
		
		public void stStudentName(String name) {
			studentName = name;
		}
		
		public static void main(String[] args) {
			Student studentAhn = new Student();
			studentAhn.studentName = "¾È¿¬¼ö";
			
			System.out.println(studentAhn.studentName);
			System.out.println(studentAhn.getStudentName());

	}

}
