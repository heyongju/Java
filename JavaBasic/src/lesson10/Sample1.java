package lesson10;

public class Sample1 {

	public static void main(String[] args) {
		String str = "Hello";
		char ch1 = str.charAt(0); //ù��° ���ڸ� ����
		char ch2 = str.charAt(1); // �ι�° ���ڸ� ����
		int len = str.length(); // ���ڿ��� ���̸� ��ȯ
		System.out.println(str + "�� ù ��° ���ڴ� " + ch1 + " �Դϴ�.");
		System.out.println(str + "�� �� ��° ���ڴ� " +  ch2 + " �Դϴ�.");
		System.out.println(str + "�� ���̴�" + len + "�Դϴ�.");
	}

}
