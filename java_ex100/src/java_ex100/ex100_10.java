package java_ex100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex100_10 {

	public static void main (String[] args) throws IOException{
		/*
		 * 문제 10
		 * 
		 * 정수(integer) 두 개를 입력받아 그대로 출력해보자.
		 * 
		 * 입력
		 * 
		 * 두 개의 정수가 차례대로 입력된다.
		 * 
		 * 출력
		 * 
		 * 입력받은 두 정수를 공백으로 구분하여 그대로 출력한다.
		 * 
		 * 입력 예시
		 * 
		 * 1
		 * 
		 * 2
		 * 
		 * 출력 예시
		 * 
		 * 1 2
		 * 
		 * 
		 * 
		 * 도움말
		 * 
		 * Scanner 클래스를 사용하면 된다. nextInt() 메소드 사용.
		 */
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br1.readLine());
		int num2 = Integer.parseInt(br2.readLine());
		System.out.println(num1+ " "+ num2);
	}
}
