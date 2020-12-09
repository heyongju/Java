package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class BorderLayoutEx extends JFrame{
	
	BorderLayoutEx(){
		setTitle("BorderLayout Sample"); //������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ �����׷� ����
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); //����Ʈ�ҿ� LowLayout ��ġ������ ����
		
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("calculate"), BorderLayout.CENTER);
		
		setSize(300, 200); //������ ũ�� 300x200 ����
		setVisible(true); //�������� ȭ�鿡 ���
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
