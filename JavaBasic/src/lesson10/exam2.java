package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam2 {

	public static void main(String[] args) throws IOException{
		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		System.out.println("a�� �� ��ġ�� ������ �Է��Ͻʽÿ�");
		String str2 = br.readLine();
		int num = Integer.parseInt(str2);
		
		StringBuffer str3 = new StringBuffer(str1);
		
		str3.insert(num, "a");
		System.out.println(str3);
	}

}
