package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("�̿���");
		System.out.println(studentLee.getSerialNum());
		System.out.println(studentLee.getcardNum());
		System.out.println(studentLee.studentName + " �й�:" + studentLee.getSerialNum() + " ī�� ��ȣ:" + studentLee.getcardNum());
		
		
		Student3 studentH = new Student3();
		studentH.setStudentName("Ȳ�伷");
		System.out.println(Student3.getSerialNum());
		System.out.println(Student3.getcardNum());
		System.out.println(studentH.studentName + " �й�:" + Student3.getSerialNum() + " ī�� ��ȣ:" + Student3.getcardNum());
	}

}
