package lesson14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample7 {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")));
			
			pw.println("HELLO!");
			pw.println("GOODBYE!");
			System.out.println("���Ͽ� ��ϵǾ����ϴ�.");
			pw.close();
		}catch(IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}

}
