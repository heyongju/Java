package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenermouseEx extends JFrame{
	
	ListenermouseEx(){
		setTitle("버튼에 mose 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼 컴포넌트를 생성하고 mouselistener를 단다.
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		btn.setSize(50, 20);
		MyMouseListener listener = new MyMouseListener(); //마우스 리스너를 생성한다.
		btn.addMouseListener(listener); //마우스 리스너를 단다.
		
		// 버튼을 컨텐트펜에 단다.
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenermouseEx();
	}
	
	//MouseListener을 상속받아 Mouse 리스너를 작성한다.
	// MouseListener의 5개 메소드를 모두 구현한다.
	
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
