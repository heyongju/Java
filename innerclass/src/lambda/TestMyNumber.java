package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		Mynumber max = (x,y) -> (x>=y) ? x:y; //���ٽ��� �������̽��� max������ ����
		System.out.println(max.getMax(10, 20));
	}

}
