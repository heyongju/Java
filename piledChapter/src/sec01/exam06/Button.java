package sec01.exam06;

public class Button {
	OnClickListener listener; //�������̽� Ÿ�� �ʵ�
	
	void setOnClickLstener(OnClickListener listener) { //�Ű������� ������
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	static interface OnClickListener{ //��ø �������̽�
		void onClick();
	}
}
