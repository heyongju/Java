package java_ex100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex100_07 {

	public static void main(String[] args) throws IOException{
		/*
		 * 문제 7
		 * 키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성해보자.
		 
		 * 입력
		 * 정수값 한 개가 입력된다.
		 * 출력
		 * 입력된 정수를 그대로 출력한다.
		 
		 * 입력 예시
		 * 
		 * 15
		 * 
		 * 출력 예시
		 * 
		 * 15
		 * 
		 * 도움말
		 * 
		 * Scanner 클래스를 사용하면 된다. nextInt() 메소드 사용.
		 * 
		 * import java.util.Scanner;
		 * 
		 * 중간생략...
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int i = scan. nextInt();
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}

}
