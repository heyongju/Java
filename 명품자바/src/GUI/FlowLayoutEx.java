package GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx(){
		setTitle("FlowLayout Sample"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프레그램 종료
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); //컨텐트팬에 LowLayout 배치관리자 설정
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("calculate"));
		
		setSize(300, 200); //프레임 크레 300x200 설정
		setVisible(true); //프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
