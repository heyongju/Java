package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample2 {

	public static void main(String[] args) throws IOException{
		System.out.println("�����ڸ� �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();//�빮�ڷ� ��ȯ
		String strl = str.toLowerCase(); //�ҹ��ڷ� ��ȯ
		
		System.out.println("�빮�ڷ� ��ȯ�ϸ� " + stru + "�Դϴ�.");
		System.out.println("�ҹ��ڷ� ��ȯ�ϸ� " + strl + "�Դϴ�.");
	}

}
