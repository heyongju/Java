package interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void dsecription() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod(); // ����Ʈ �޼��忡�� private �޼��� ȣ��
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod(); //���� �޼��忡�� private static �޼��� ȣ��
		return total;
	}
	
	private void myMethod() {
		System.out.println("private �޼��� �Դϴ�."); //private �޼���
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼��� �Դϴ�.");
	}
}
