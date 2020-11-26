package sec03.exam02;

public class Dog extends Animal {
	public Dog() {   //디폴트 생성자
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");   //추상메소드 재정의
		
	}
}
