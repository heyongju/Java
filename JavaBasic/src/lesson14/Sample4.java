package lesson14;

public class Sample4 {

	public static void main(String[] args) {
		try {
			
			int []  test = new int[5];
			
			System.out.println("test[10]�� ���� �����մϴ�.");
			
			test [10] = 80;
			System.out.println("test[10]�� 80�� �����߽��ϴ�");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���̸� �Ѿ���ϴ�.");
			System.out.println(e + " �̶�� ���ܰ� �߻��߽��ϴ�.");
		}
			System.out.println("������ ����ƽ��ϴ�.");	
	}

}
