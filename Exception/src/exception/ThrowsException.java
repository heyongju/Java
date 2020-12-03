package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream ifs = new FileInputStream(fileName); //FileNorFoundException 발생 가능
		Class c = Class.forName(className);  //ClassNotFoundException 발생 가능
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		test.loadClass("a.txt", "Java.lang.String"); //메서드를 호출할 때 예외 처리함

	}

}
