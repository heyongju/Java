package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			FileInputStream ifs = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println("1");
			System.out.println(e);
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
