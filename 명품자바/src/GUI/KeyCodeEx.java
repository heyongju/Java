package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class KeyCodeEx extends JFrame{

	JPanel contentPane = new JPanel(); // ����Ʈ������ ����� �г�
	JLabel la = new JLabel(); //�� ���̺� ������Ʈ ����


	KeyCodeEx(){
		setTitle("Key Code ���� : F1Ű: �ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(300, 150);
		setVisible(true);

		// ����Ʈ ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();
	}

	//Key ������ ����

	class MyKeyListner extends KeyAdapter{
		public void KeyPressed(KeyEvent e) {
			// la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(e.getKeyText(e.getKeyCode()) + "Ű�� �ԷµǾ���");

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
