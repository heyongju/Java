package GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame{
	JPanel contentPane = new JPanel(); 
	static JLabel[] keyMessage; //3개의 메시지를 풀력할 레이블 컴포넌트 배열
	
	KeyListenerEx(){
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		
		// 레이블 배열을 3개 생성하고 각 레이블 컴포넌트 생성
		keyMessage = new JLabel[3]; // 레이블 배열 생성
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		// 3개의 레이블 컴포넌트를 컨텐트팬에 부착
		for(int i=0; i< keyMessage.length; i++) {
			contentPane.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //배경색이 보이도록 불투명 속성 설정
			keyMessage[i].setBackground(Color.green);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
