package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		int Qo = minus(num1, num2);
		int rhq = mul(num1, num2);
		float sk = sksn(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�.");
		System.out.println(num1 + " - " + num2 + " = " + Qo + "�Դϴ�.");
		System.out.println(num1 + " x " + num2 + " = " + rhq + "�Դϴ�.");
		System.out.println(num1 + " / " + num2 + " = " + sk + "�Դϴ�.");
		
	}

	private static float sksn(float num1, int num2) {
		float result = num1 / num2;
		return result;
	}

	private static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	private static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	private static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1 + num2;
		return result;
	}
	

}
