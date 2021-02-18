package Toy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class proJUp {

	static class MyFrame extends JFrame{

		static class MyPanel extends JPanel{ //�׷��� ����
			public MyPanel() {
				this.setSize(800, 400);
				this.setBackground(Color.black);
			}
			public void paint(Graphics g) {
				super.paint(g);
				Graphics2D g2d = (Graphics2D) g; //����Ʈ g�� �ٿ�ĳ�����ϱ�
				g2d.setColor(Color.white); // �÷� ����
				g2d.fillRect(barLeftPos.x, barLeftPos.y, 20, barHeight); //���� �� �׸��� �ٴ� ���Ʒ��θ� �����̹Ƿ� y���� Ű���� �Է����� ����
				g2d.fillRect(barRightPos.x, barRightPos.y, 20, barHeight); // ������ �� �׸���
				g2d.setFont(new Font("TimesRoman", Font.BOLD, 50)); //��Ʈ ����
				g2d.drawString(scoreLeft + " vs " + scoreRight, 400-50, 50); //���ڿ� �ֱ�
				g2d.fillOval(ballPos.x, ballPos.y, 20, 20); //�� ��ġ�� ũ�� �����ϱ�
			}
		}
		//���� ����
		static Timer timer = null; 
		static int dir = (int) (Math.random()*4); //���� ���� ���� ���ϱ� �����Լ��� ����ؼ� 0 ~ 3 ���� �����ϰ� �����ϵ�����.
		static Point ballPos = new Point(400-10, 200-10); //���� �� ��ġ
		static final int BALL_SPEED = 5; // ���� �⺻ �̺��ӵ�
		static float ballSpeedX = BALL_SPEED; //���� x�� �̵��ӵ�
		static float ballSpeedY = BALL_SPEED; // ���� y�� �̵��ӵ�
		static int ballWidth = 20; //�� ����
		static int ballHeight = 20; // �� ����
		static int barWidth = 20;
		static int barHeight = 80;
		static Point barLeftPos = new Point(50, 200-40); //���� �� ��ġ����
		static Point barRightPos = new Point(800-50-20, 200-40); //������ �� ��ġ����
		static int barLeftYTarget = barLeftPos.y; //���� �� ��ǥ ��
		static int barRightYTarget = barRightPos.y; //������ �� ��ǥ �� �ε巴�� �̵��ϱ����ؼ� 
		static MyPanel myPanel = null;
		static int scoreLeft = 0;
		static int scoreRight = 0;

		public MyFrame(String title) { //ȯ�漳��
			super(title); //������ ���ο� �Է��Ͽ���.
			this.setVisible(true); // ������ ���̵���
			this.setSize(800, 430); //������� 800, 400 ����
			this.setLayout(new BorderLayout()); //���̾ƿ��� �������̾ƿ����� �ؼ� �г��� ������ �߾ӿ� ��ġ�ϵ��� ��.
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			myPanel = new MyPanel(); // MyPanel�� �� �ν��Ͻ� myPanel ����
			this.add("Center", myPanel); //���Ϳ� myPanel�ν��Ͻ��� �߰�

			setKeyListener(); //Ű������ ����
			startTimer(); //Ÿ�̸� ����
		}

		public void setKeyListener() { //Ű ������ ����
			this.addKeyListener(new KeyListener() { //Ű������ �߰��ϱ� (KeyAdapter�� �� ���� �ִµ� �ڵ����� �������̵� ���ִϱ� �����ʷ� ����.)

				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_UP) { //Ű �̺�Ʈ�� UpŰ�� ������
						System.out.println("Pressed Up Key"); //���� ���ڿ� ����ϰ�
						barLeftYTarget -= 10;	// ���� ��(barLeftYTarget = barLeft�� Y������)�� -10 �Ѵ�. (���� �����ӿ��� y�������� ���� ���� ȭ�� ���)
						if(barLeftPos.y < barLeftYTarget) { // Ÿ�ٰ��� �����ϱ⶧���� bar�� y���� Ÿ�ٰ��� ������ ���Ѵ�. �̹� ������ ����Ǿ����� ������ UI���� ���� �������شٰ� �Ѵ�.
							barLeftYTarget = barLeftPos.y - 10;
						}
						barRightYTarget -= 10;	
						if(barRightPos.y < barRightYTarget) { 
							barRightYTarget = barRightPos.y - 10;
						}
					}
					else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						System.out.println("Pressed Down Key");
						barLeftYTarget += 10;
						if(barLeftPos.y > barLeftYTarget) {
							barLeftYTarget = barLeftPos.y +10;
						}
						barRightYTarget += 10;	
						if(barRightPos.y < barRightYTarget) { 
							barRightYTarget = barRightPos.y + 10;
						}
					}
				}

				@Override
				public void keyTyped(KeyEvent e) { //�Ⱦ��� �޼���
					// TODO Auto-generated method stub

				}

				@Override
				public void keyReleased(KeyEvent e) { //�Ⱦ��� �޼���
					// TODO Auto-generated method stub

				}


			});
		}
		public void startTimer() {
			timer = new Timer(15, new ActionListener() { //ȭ�� ������ ���� �׼Ǹ����� ����

				@Override
				public void actionPerformed(ActionEvent e) { //Ÿ�̸� �̺�Ʈ
					if(barLeftPos.y > barLeftYTarget) {
						barLeftPos.y -= 5;
						barRightPos.y -= 5;
					}else if (barLeftPos.y < barLeftYTarget) {
						barLeftPos.y += 5;
						barRightPos.y += 5;
					}
					if(barLeftPos.y > 400 - barHeight)
						barLeftPos.y = 400 - barHeight;

					if(dir ==0) {  // 0 == ���� ������ ���ΰ� �� 
						ballPos.x += ballSpeedX;
						ballPos.y -= ballSpeedY;
					}else if (dir ==1) { // 1 == ���� ������ �Ʒ���
						ballPos.x += ballSpeedX;
						ballPos.y += ballSpeedY;
					}else if (dir ==2) { // 2 == ���� ���� ����
						ballPos.x -= ballSpeedX;
						ballPos.y -= ballSpeedY;
					}else if (dir ==3) { // 3 == ���� ���� �Ʒ���
						ballPos.x -= ballSpeedX;
						ballPos.y += ballSpeedY;
					}
					checkCollision(); //�浹üũ
					myPanel.repaint(); //ȭ�� ����
				}

			});
			timer.start(); //Ÿ�̸Ӹ� �����ϱ�
		}
		public void setSpeed(Point barPos) { //�� ��ġ�� ���� ������ ���ǵ� ����
			int barCenerY = barPos.y + (barHeight/2); //���� y ���Ͱ� ����
			int ballCenterY = ballPos.y + (ballHeight/2); //���� y ���Ͱ�
			
			float offset = Math.abs(barCenerY - ballCenterY); //�ٿ� ���� y���� �� ���� ��(���� ���� �߾ӿ� �¾Ҵ��� �����ڸ��� �¾Ҵ��� Ȯ��)
			// offset���� 0�̸� �߾ӿ� �¾Ҵ� ��� 40�� ������ �����ڸ� 
			float offsetRate = (offset * 1.5f) / (barHeight / 2); //�� ������ ������ �ٽ� ���� ��������. 0 ~ 1.0 ���� ������ ��. 
			if(offsetRate < 0.1f )
				offsetRate = 0.1f;
			if(offsetRate > 1.5f)
				offsetRate = 1.5f;
			ballSpeedY = BALL_SPEED * offsetRate; //y�� BALL_SPEED�� offsetRate�� ���ؼ� ������ �ӵ��� ���ϰ� ���� 
			if(ballSpeedY <1) // ���� y�� �ӵ��� �ʹ� ������ �ʵ��� �ּ� �ӵ� ��������
				ballSpeedY = 1;
		}
		
		public void checkCollision() {
			if(dir == 0) { // 0�� ������ ��
				if(ballPos.y < 0) { // ���� y���� 0���� ���� ��� (���� ��迡 ���� ���)
					dir = 1;   // ���� ������ ������ �Ʒ��� ����
				}
				if(ballPos.x > 800 - barWidth) { // ���� x���� 800�� �ʰ��� ���(������ ������ ��迡 �������)
					dir = 2;   // ���� ������ ���� ���� ����
					scoreLeft += 1 ;
				}
				if(ballPos.x > barRightPos.x - barWidth && (ballPos.y >= barRightPos.y && ballPos.y <= barRightPos.y + barHeight)) {
					// ���� x���� ���� x�� - ���� �ʺ񺸴� ũ�� && ( ���� y���� ���� y�� �̻��̰�, ���� y���� �� ���� �����ϰ�� )
					dir = 2;
					setSpeed(barRightPos);
				}
			}
			if(dir == 1) { // 1�� ������ �Ʒ�
				if(ballPos.y > 400 - ballHeight) { // ���� y���� 400�� �ʰ��� ���(������ �Ʒ� ��迡 ���� ���)
					dir = 0;
				}
				if(ballPos.x > 800 - (ballWidth)) { //���� x���� 800�� �ʰ��� ���
					dir = 3;
					scoreLeft += 1 ;
				}
				if(ballPos.x > barRightPos.x - barWidth && (ballPos.y >= barRightPos.y && ballPos.y <= barRightPos.y + barHeight)) {
					dir = 3;
					setSpeed(barRightPos);
				}
			}
			else if (dir == 2) { // 2�� ���� ��
				if(ballPos.y < 0) { // ���� y���� 0 �̸��� ���
					dir = 3;
				}
				if(ballPos.x < 0) { // ���� x���� 0 �ʰ��� ���
					dir = 0;
					scoreRight += 1 ;
				}
				if(ballPos.x < barLeftPos.x + barWidth && (ballPos.y >= barLeftPos.y && ballPos.y <= barLeftPos.y + barHeight)) {
					dir = 0;
					setSpeed(barLeftPos);
				}
			}
			else if (dir == 3) { // 3�� ���� �Ʒ�
				if(ballPos.y > 400 - ballHeight) { // ���� y���� 400�� �ʰ��� ���
					dir = 2;
				}
				if(ballPos.x <0 ) { // ���� x���� 0 �̸��� ���
					dir = 1;
					scoreRight += 1 ;
				}
				if(ballPos.x < barLeftPos.x + barWidth && (ballPos.y >= barLeftPos.y && ballPos.y <= barLeftPos.y + barHeight)) {
					dir = 1;
					setSpeed(barLeftPos);
				}
			}
		}
	}
	public static void main(String[] args) {
		new MyFrame("Game ex");
	}

}
