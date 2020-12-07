package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass; //내부 클래스 자료형 변수를 먼저 선언
	
	static class InStaticClass{ //정적 내부 클래스
		int inNum = 100; 		//정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200;// 정적 내부 클래스의 정적 변수
		
	void inTest() { //정적 내부 클래스의 일반 메서드
		//num +=10; //외부 클래스의 인스턴스 변수는 사용할 수 없음. ***
		System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용");
		System.out.println("InStaticClass SInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수 사용)");
	}
	
	static void sTest() {
		//num += 10;
		//inNum += 10; //외부클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
		System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
	}
}
	

	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 20; //인스턴스 내부 클래스에 정적 변수 선언 불가능.
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
			}
	}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main (String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();//내부 클래스 기능호출
		System.out.println();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}

