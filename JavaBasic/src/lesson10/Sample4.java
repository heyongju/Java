package lesson10;

import java.io.*;


public class Sample4 {

	public static void main(String[] args) throws IOException{
		System.out.println("���ڿ��� �Է��ϼ���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); //�߰��� ���ڿ��� �о���Դϴ�.
		
		System.out.println("�߰��� ���ڿ��� �Է��Ͻʽÿ�.");
		
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println('"' + str1 + '"' + "�� " + '"' + str2 + '"' + "��(��) �߰��ϸ� " + '"' + sb + '"' + "�Դϴ�.");
	}

}
