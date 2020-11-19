package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이용주");
		System.out.println(studentLee.getSerialNum());
		System.out.println(studentLee.getcardNum());
		System.out.println(studentLee.studentName + " 학번:" + studentLee.getSerialNum() + " 카드 번호:" + studentLee.getcardNum());
		
		
		Student3 studentH = new Student3();
		studentH.setStudentName("황요섭");
		System.out.println(Student3.getSerialNum());
		System.out.println(Student3.getcardNum());
		System.out.println(studentH.studentName + " 학번:" + Student3.getSerialNum() + " 카드 번호:" + Student3.getcardNum());
	}

}
