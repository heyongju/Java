package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam {

	public static void main(String[] args) throws IOException{
		System.out.println("문자열을 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();
		System.out.println(str1 + "을(를) 거꾸로 읽으면 " + sb + "입니다.");
	}

}
