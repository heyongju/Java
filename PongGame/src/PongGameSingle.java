import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

public class PongGameSingle {
	static class MyFrame extends JFrame{

		static class MyPanel extends JPanel{ //Canvas for Grahpics
			public MyPanel() {
				this.setSize(800,400);
				this.setBackground(Color.black);
			}

			public void paint(Graphics g) {
				
				super.paint(g);
				Graphics2D g2d = (Graphics2D)g;
				g2d.setColor(Color.white);
				g2d.fillRect(barLeftPos.x, barLeftPos.y, 20, 80);
				g2d.fillRect(barRightPos.x , barRightPos.y, 20, 80);
				g2d.setFont(new Font("TimesRoman", Font.BOLD, 50));
				g2d.drawString(scoreLeft + " vs " + scoreRight, 400-50, 50);
				g2d.fillOval(ballPos.x, ballPos.y, 20, 20);
			}
		}
		//variables
		static Timer timer = null;
		static int dir = 0; //공의 방향은 0=> Up-Right, 1=>Down-Right, 2=>Up-Left, 3=>Down-Left
		static Point ballPos = new Point(400-10, 200-10);
		static int ballSpeed = 2; //2px per 1 timer
		static int ballWidth = 20;
		static int ballHeight = 20;
		static int barHeight = 80;
		static Point barLeftPos = new Point(50, 200-40);
		static Point barRightPos = new Point(800-50-20, 200-40);
		static int barLeftYTarget = barLeftPos.y; //목표값 - interpolation(부드럽게 움직이게하기)
		static int barRightYTarget = barRightPos.y; 
		static MyPanel myPanel = null;
		static int scoreRight = 0;
		static int scoreLeft = 0;

		public MyFrame(String title) {
			super(title);
			this.setVisible(true);
			this.setSize(800, 400);
			this.setLayout(new BorderLayout());
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

			myPanel = new MyPanel();
			this.add("Center", myPanel);

			setKeyListener();
			startTimer();
		}
		public void setKeyListener() {
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) { // Key Event
					if(e.getKeyCode() == KeyEvent.VK_UP) {
						System.out.println("Pressed Up Key");
						barLeftYTarget-= 10;
						if(barLeftPos.y < barLeftYTarget) {
							barLeftYTarget = barLeftPos.y -10;
						}
						barRightYTarget -= 10;
						if(barRightPos.y < barRightYTarget) {
							barRightYTarget = barRightPos.y -10;
						}
					}
					else if(e.getKeyCode() ==KeyEvent.VK_DOWN){
						System.out.println("Presed Down Key");
						barLeftYTarget+= 10;
						if(barLeftPos.y > barLeftYTarget) {
							barLeftYTarget = barLeftPos.y +10;
						}		
						barRightYTarget += 10;
						if(barRightPos.y > barRightYTarget) {
							barRightYTarget = barRightPos.y +10;
						}
					}

				}
			});
		}

		public void startTimer() {
			timer = new Timer(10, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(barLeftPos.y > barLeftYTarget) {
						barLeftPos.y -= 5;
					}else if(barLeftPos.y < barLeftYTarget) {
						barLeftPos.y += 5;
					}
					if(barRightPos.y > barRightYTarget) {
						barRightPos.y -= 5;
					}else if(barRightPos.y < barRightYTarget) {
						barRightPos.y += 5;
					}
					if(dir ==0) { // 0 => Up-Right
						ballPos.x += ballSpeed;
						ballPos.y -= ballSpeed;
					}else if (dir ==1) { // 1 => Down-Right
						ballPos.x += ballSpeed;
						ballPos.y += ballSpeed;
					}else if (dir ==2) { // 2 => Up-Left
						ballPos.x -= ballSpeed;
						ballPos.y -= ballSpeed;
					}else if (dir ==3) { // 3 => Down-Left
						ballPos.x -= ballSpeed;
						ballPos.y += ballSpeed;
					}
					//충돌체크
					checkCollision();
					myPanel.repaint(); // Re-Draw
				}
			});
			timer.start(); //
		}

		public void checkCollision() {
			if (barLeftPos.y < 0) {
				barLeftPos.y = 0;
			}
			if (barLeftPos.y > 200+barHeight) {
				barLeftPos.y = 200+barHeight;
			}
			if (barRightPos.y < 0) {
				barRightPos.y = 0;
			}
			if (barRightPos.y > 200+barHeight) {
				barRightPos.y = 200+barHeight;
			}
			if(dir ==0) { // 0 => Up-Right
				if(ballPos.y < 0) { //위쪽 벽에 부딪힌 경우
					dir = 1;
				}
				if(ballPos.x >800 -ballWidth) {
					dir = 2;
					scoreLeft += 1;
				}
				if(ballPos.x > barRightPos.x -ballWidth &&  //바에 부딪힌 경우
						(ballPos.y >= barRightPos.y && ballPos.y <= barRightPos.y + barHeight)) {
					dir = 2;
				}
			}else if (dir ==1) { // 1 => Down-Right
				if(ballPos.y > 400-ballHeight-30) {
					dir = 0;
				}
				if(ballPos.x > 800-ballWidth) {
					dir = 3;
					scoreLeft += 1;
				}
				if(ballPos.x > barRightPos.x -ballWidth && 
						(ballPos.y >= barRightPos.y && ballPos.y <= barRightPos.y + barHeight)) {
					dir = 3;
				}
			}else if (dir ==2) { // 2 => Up-Left
				if(ballPos.y < 0) {
					dir = 3;
				}
				if(ballPos.x < 0) {
					dir = 0;
					scoreRight += 1;
				}
				if(ballPos.x < barLeftPos.x +ballWidth && 
						(ballPos.y >= barLeftPos.y && ballPos.y <= barLeftPos.y + barHeight )) {
					dir = 0;
				}
			}else if (dir ==3) { // 3 => Down-Left
				if(ballPos.y > 400-ballHeight-30) {
					dir = 2;
				}
				if(ballPos.x< 0) {
					dir = 1;
					scoreRight += 1;
				}
				if(ballPos.x < barLeftPos.x +ballWidth && 
						(ballPos.y >= barLeftPos.y && ballPos.y <= barLeftPos.y + barHeight )) {
					dir = 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		new MyFrame("Pong Game Single");
	}


}
