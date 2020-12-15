package GUI;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame{

	Container contentPane;
	TextFieldEx(){
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름 : "));
		contentPane.add(new JTextField(10)); //창 크기가 10인 텍스트 필드
		contentPane.add(new JLabel("학과 : "));
		contentPane.add(new JTextField("컴퓨터공학과(수정")); 
		contentPane.add(new JLabel("주소 : "));
		contentPane.add(new JTextField("서울시...", 20)); //창 크기가 20인 텍스트필드
		
		setSize(350,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
