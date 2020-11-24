package array;
import java.util.ArrayList;
public class Array_list_test {

	public static void main(String[] args) {
		ArrayList<Student> library = new ArrayList<Student>();
		
		library.add(new Student("James"));
		library.add(new Student("Tomas"));
		library.add(new Student("Eadward"));
		
		for (Student student : library) {
			student.showStudentInfo();
		}
	}

}
