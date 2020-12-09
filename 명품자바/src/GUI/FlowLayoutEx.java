package GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx(){
		setTitle("FlowLayout Sample"); //������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ �����׷� ����
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); //����Ʈ�ҿ� LowLayout ��ġ������ ����
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("calculate"));
		
		setSize(300, 200); //������ ũ�� 300x200 ����
		setVisible(true); //�������� ȭ�鿡 ���
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
