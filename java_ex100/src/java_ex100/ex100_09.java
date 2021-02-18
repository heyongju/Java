package java_ex100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex100_09 {

	public static void main(String[] args) throws IOException{
		/*
		 * 문제 9
		 * 
		 * 키보드로 입력한 실수(소수점이 있는 수)를 그대로 출력하는 프로그램을 작성해보자.
		 * 
		 * 입력
		 * 
		 * 실수 한 개가 입력된다.
		 * 
		 * 출력
		 * 
		 * 입력된 실수를 그대로 출력한다.
		 * 
		 * 
		 * 
		 * 입력 예시
		 * 
		 * 1.414
		 * 
		 * 출력 예시
		 * 
		 * 1.414
		 * 
		 * 도움말
		 * 
		 * Scanner 클래스를 사용하면 된다. nextFloat() 메소드 사용.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float num = Float.parseFloat(br.readLine());
		System.out.println(num);
		
	}

}
