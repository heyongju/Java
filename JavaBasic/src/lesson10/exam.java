package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam {

	public static void main(String[] args) throws IOException{
		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();
		System.out.println(str1 + "��(��) �Ųٷ� ������ " + sb + "�Դϴ�.");
	}

}
