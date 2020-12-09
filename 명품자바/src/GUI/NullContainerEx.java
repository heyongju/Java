package GUI;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
	
	NullContainerEx(){
		setTitle("Null Contatiner sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); //����Ʈ ���� ��ġ������ ����
		
		//JLabel ������Ʈ �����ϰ� ���� ��ġ�� ũ�⸦ �����Ѵ�.
		JLabel la = new JLabel("Hello, press Buttons");
		la.setLocation(130, 50); //la�� 130,50��ġ�� ����
		la.setSize(200, 20);// la�� 200x200 ũ��� ����
		c.add(la); // la�� ����Ʈ�ҿ� ����
		
		//9���� ��ư ������Ʈ�� �����ϰ� ��� ������ ũ��� �����Ѵ�.
		// ��ġ�� ���� �ٸ��� ����
		
		for(int i = 1; i <10; i++) {
			JButton b = new JButton(Integer.toString(i)); //��ư ����
			b.setLocation(i*15, i*15); //��ư�� ��ġ ����
			b.setSize(50, 20); //9���� ��ư�� ũ��� �����ϰ� 50*20 ũ��
			c.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx();
	}

}
