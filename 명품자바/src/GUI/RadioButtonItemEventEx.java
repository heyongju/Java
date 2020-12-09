package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButtonItemEventEx extends JFrame{
	Container contentPane;
	JRadioButton[] radio = new JRadioButton[3]; //������ư �迭
	String[] text = {"���", "��", "ü��"}; // ������ư�� ���ڿ�
	
	ImageIcon [] image = {// �̹��� ��ü �迭
			new ImageIcon("D:\\JAVA_LAB\\��ǰ�ڹ�\\src\\GUI\\images\\2020041405324317798_1.jpg"),
			new ImageIcon("D:\\JAVA_LAB\\��ǰ�ڹ�\\src\\GUI\\images\\80BB810A-BD80-42DF-BB1E-1CE03E6F361E.jpg"),
			new ImageIcon("D:\\JAVA_LAB\\��ǰ�ڹ�\\src\\GUI\\images\\externalFile.jpg")};
	JLabel imageLabel = new JLabel(); //�̹����� ��µ� ���̺� ������Ʈ
	
	RadioButtonItemEventEx() {
		setTitle("���� ��ư Item Event ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); //3���� ���� ��ư�� ������ �г�
		radioPanel.setBackground(Color.gray); 
		
		ButtonGroup g = new ButtonGroup(); //��ư �׷� ��ü ����
		for(int i =0; i <radio.length; i++) { //3���� ������ư�� ����
			radio[i] = new JRadioButton(text[i]);//���� ��ư ����
			g.add(radio[i]); //��ư �׷쿡 ����
			radioPanel.add(radio[i]); //�гο� ����
			radio[i].addItemListener(new MyItemListener()); //������ư�� item ������ ���
		}
		
		radio[2].setSelected(true); //ü�� ������ư�� �ʱ� ���� ���·� ����
		contentPane.add(radioPanel, BorderLayout.NORTH); //����Ʈ �ҿ� ���� �г� ����
		contentPane.add(imageLabel, BorderLayout.CENTER); // ����Ʈ �ؿ� �̹��� ���̺� ����
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(500, 1000);
		setVisible(true);
	}
	
	//Item ������ ����
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return; //���� ��ư�� ���� ������ ��� �׳� �����Ѵ�.
			if(radio[0].isSelected()) //���������ư�� ���õ� ���
				imageLabel.setIcon(image[0]);
			else if (radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else // �丮 ������ư�� ���õ� ���
				imageLabel.setIcon(image[2]);
		}
	}
	
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
		// TODO Auto-generated method stub

	}

}
