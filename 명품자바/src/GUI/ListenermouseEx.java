package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenermouseEx extends JFrame{
	
	ListenermouseEx(){
		setTitle("��ư�� mose �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ư ������Ʈ�� �����ϰ� mouselistener�� �ܴ�.
		JButton btn = new JButton("Mouse Event �׽�Ʈ ��ư");
		btn.setBackground(Color.YELLOW);
		btn.setSize(50, 20);
		MyMouseListener listener = new MyMouseListener(); //���콺 �����ʸ� �����Ѵ�.
		btn.addMouseListener(listener); //���콺 �����ʸ� �ܴ�.
		
		// ��ư�� ����Ʈ�濡 �ܴ�.
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenermouseEx();
	}
	
	//MouseListener�� ��ӹ޾� Mouse �����ʸ� �ۼ��Ѵ�.
	// MouseListener�� 5�� �޼ҵ带 ��� �����Ѵ�.
	
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.red);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.yellow);
		}
		
	}

}
