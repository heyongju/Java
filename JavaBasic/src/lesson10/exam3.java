package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam3 {

	public static void main(String[] args) throws IOException{
		System.out.println("������ 2�� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); 
		String str2 = br.readLine();
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = Math.min(a, b);
		System.out.println(a + "��(��) " + b + "�� ���� ���� " + c + "�Դϴ�.");
		
	}

}
