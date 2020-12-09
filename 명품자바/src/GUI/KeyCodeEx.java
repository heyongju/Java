package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class KeyCodeEx extends JFrame{

	JPanel contentPane = new JPanel(); // 컨텐트팬으로 사용할 패널
	JLabel la = new JLabel(); //빈 레이블 컴포넌트 생성


	KeyCodeEx(){
		setTitle("Key Code 예제 : F1키: 초록생, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(300, 150);
		setVisible(true);

		// 컨텐트 팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();
	}

	//Key 리스너 구현

	class MyKeyListner extends KeyAdapter{
		public void KeyPressed(KeyEvent e) {
			// la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함
			la.setText(e.getKeyText(e.getKeyCode()) + "키가 입력되었음");

			if(e.getKeyChar() =='%') 
				contentPane.setBackground(Color.yellow);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.green);
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
