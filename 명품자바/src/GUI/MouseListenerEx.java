package GUI;

import javax.swing.*;

public class MouseListenerEx extends JFrame{

	JPanel contentPane = new JPanel(); //컨텐트팽으로 사용할 패널
	static JLabel la; // "hello"문자열을 출력하기 위한 레이블 컴포넌트
	
	MouseListenerEx(){
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(contentPane); //컨텐트팬 변경
		contentPane.setLayout(null); //컨텐트팬의 배치관리자 삭제
		contentPane.addMouseListener(new MyMouseAdapter()); //컨텐트팬에 Mouse리스너 달기
		
		la = new JLabel("hello"); //"hello" 레이블 컴포넌트 생성
		la.setSize(50, 20); //레이블의 크기 50x20을 설정
		la.setLocation(30, 30); //레이블의 위치 (30,30)으로 설정
		contentPane.add(la);// 레이블 컴포넌트에 컨텐트팬을 추가
		setSize(200, 200);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
