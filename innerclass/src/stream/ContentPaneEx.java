package stream;

import java.awt.*;

import javax.swing.*;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("*ConctentPane�� JFrame"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		Container contentPane = getContentPane(); //����Ʈ ���� �˾Ƴ���.
		contentPane.setBackground(Color.ORANGE); //�������� ��� ����
		contentPane.setLayout(new FlowLayout()); //����Ʈ �ҿ� FlowLayout ��ġ������ �ޱ�
		contentPane.add(new JButton("OK")); //OK��ư �ޱ�
		contentPane.add(new JButton("Cancel")); //Cancel��ư �ޱ�
		contentPane.add(new JButton("Ignore")); //Ignore ��ư �ޱ�
		
		setSize(300,150); //������ ũ�� 300*150 ����
		setVisible(true);// ������ ȭ�鿡 ���
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}