package GUI;

import javax.swing.*;

public class MouseListenerEx extends JFrame{

	JPanel contentPane = new JPanel(); //����Ʈ������ ����� �г�
	static JLabel la; // "hello"���ڿ��� ����ϱ� ���� ���̺� ������Ʈ
	
	MouseListenerEx(){
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(contentPane); //����Ʈ�� ����
		contentPane.setLayout(null); //����Ʈ���� ��ġ������ ����
		contentPane.addMouseListener(new MyMouseAdapter()); //����Ʈ�ҿ� Mouse������ �ޱ�
		
		la = new JLabel("hello"); //"hello" ���̺� ������Ʈ ����
		la.setSize(50, 20); //���̺��� ũ�� 50x20�� ����
		la.setLocation(30, 30); //���̺��� ��ġ (30,30)���� ����
		contentPane.add(la);// ���̺� ������Ʈ�� ����Ʈ���� �߰�
		setSize(200, 200);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
