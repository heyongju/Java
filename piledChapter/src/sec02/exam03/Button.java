package sec02.exam03;

public class Button {
	OnclickListener listener; //�������̽� Ÿ�� �ʵ�

	public void setOnClickListner(OnclickListener listener) {
		this.listener = listener; //�Ű� ������ ������
	}
	
	void touch() {
		listener.onClick(); // ������ü�� onClick()�޼ҵ� ȣ��
	}
	
	static interface OnclickListener{
		void onClick();
	}
	
	
}
