package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam3 {

	public static void main(String[] args) throws IOException{
		System.out.println("정수를 2개 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); 
		String str2 = br.readLine();
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = Math.min(a, b);
		System.out.println(a + "와(과) " + b + "중 작은 쪽은 " + c + "입니다.");
		
	}

}
