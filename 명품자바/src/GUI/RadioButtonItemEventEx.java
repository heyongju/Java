package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButtonItemEventEx extends JFrame{
	Container contentPane;
	JRadioButton[] radio = new JRadioButton[3]; //라디오버튼 배열
	String[] text = {"사과", "배", "체리"}; // 라디오버튼의 문자열
	
	ImageIcon [] image = {// 이미지 객체 배열
			new ImageIcon("D:\\JAVA_LAB\\명품자바\\src\\GUI\\images\\2020041405324317798_1.jpg"),
			new ImageIcon("D:\\JAVA_LAB\\명품자바\\src\\GUI\\images\\80BB810A-BD80-42DF-BB1E-1CE03E6F361E.jpg"),
			new ImageIcon("D:\\JAVA_LAB\\명품자바\\src\\GUI\\images\\externalFile.jpg")};
	JLabel imageLabel = new JLabel(); //이미지가 출력될 레이블 컴포넌트
	
	RadioButtonItemEventEx() {
		setTitle("라디오 버튼 Item Event 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); //3개의 라디오 버튼이 부착될 패널
		radioPanel.setBackground(Color.gray); 
		
		ButtonGroup g = new ButtonGroup(); //버튼 그룹 객체 생성
		for(int i =0; i <radio.length; i++) { //3개의 라디오버튼에 대해
			radio[i] = new JRadioButton(text[i]);//라디오 버튼 생성
			g.add(radio[i]); //버튼 그룹에 부착
			radioPanel.add(radio[i]); //패널에 부착
			radio[i].addItemListener(new MyItemListener()); //라디오버튼에 item 리스너 등록
		}
		
		radio[2].setSelected(true); //체리 라디오버튼을 초기 선택 상태로 설정
		contentPane.add(radioPanel, BorderLayout.NORTH); //컨텐트 팬에 라디오 패널 부착
		contentPane.add(imageLabel, BorderLayout.CENTER); // 컨텐트 팽에 이미지 레이블 부착
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(500, 1000);
		setVisible(true);
	}
	
	//Item 리스너 구형
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return; //라디오 버튼이 선택 해제된 경우 그냥 리턴한다.
			if(radio[0].isSelected()) //사과라디오버튼이 선택된 경우
				imageLabel.setIcon(image[0]);
			else if (radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else // 페리 라디오버튼이 선택된 경우
				imageLabel.setIcon(image[2]);
		}
	}
	
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
		// TODO Auto-generated method stub

	}

}
