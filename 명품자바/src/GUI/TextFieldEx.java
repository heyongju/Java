package GUI;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame{

	Container contentPane;
	TextFieldEx(){
		setTitle("�ؽ�Ʈ �ʵ� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("�̸� : "));
		contentPane.add(new JTextField(10)); //â ũ�Ⱑ 10�� �ؽ�Ʈ �ʵ�
		contentPane.add(new JLabel("�а� : "));
		contentPane.add(new JTextField("��ǻ�Ͱ��а�(����")); 
		contentPane.add(new JLabel("�ּ� : "));
		contentPane.add(new JTextField("�����...", 20)); //â ũ�Ⱑ 20�� �ؽ�Ʈ�ʵ�
		
		setSize(350,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
