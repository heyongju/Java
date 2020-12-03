package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream ifs = new FileInputStream(fileName); //FileNorFoundException �߻� ����
		Class c = Class.forName(className);  //ClassNotFoundException �߻� ����
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		test.loadClass("a.txt", "Java.lang.String"); //�޼��带 ȣ���� �� ���� ó����

	}

}
