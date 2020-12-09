package GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame{
	JPanel contentPane = new JPanel(); 
	static JLabel[] keyMessage; //3���� �޽����� Ǯ���� ���̺� ������Ʈ �迭
	
	KeyListenerEx(){
		setTitle("KeyListener ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		
		// ���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
		keyMessage = new JLabel[3]; // ���̺� �迭 ����
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		// 3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
		for(int i=0; i< keyMessage.length; i++) {
			contentPane.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //������ ���̵��� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.green);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		//����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
