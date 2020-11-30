package sec01.exam01;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		if(args.length ==2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		
	} else {
		System.out.println("두 개의 실행 매개값이 필요합니다.");
	}
	}//Run옵션에서 프로그램 arguments에서 배열 추가하면 사라지느데 쓸 일은 없을 듯??
}
