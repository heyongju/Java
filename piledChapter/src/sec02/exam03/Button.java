package sec02.exam03;

public class Button {
	OnclickListener listener; //인터페이스 타입 필드

	public void setOnClickListner(OnclickListener listener) {
		this.listener = listener; //매개 변수의 다형성
	}
	
	void touch() {
		listener.onClick(); // 구현객체의 onClick()메소드 호출
	}
	
	static interface OnclickListener{
		void onClick();
	}
	
	
}
