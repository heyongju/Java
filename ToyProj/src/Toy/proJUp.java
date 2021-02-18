package Toy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class proJUp {

	static class MyFrame extends JFrame{

		static class MyPanel extends JPanel{ //그래픽 설정
			public MyPanel() {
				this.setSize(800, 400);
				this.setBackground(Color.black);
			}
			public void paint(Graphics g) {
				super.paint(g);
				Graphics2D g2d = (Graphics2D) g; //페인트 g를 다운캐스팅하기
				g2d.setColor(Color.white); // 컬러 지정
				g2d.fillRect(barLeftPos.x, barLeftPos.y, 20, barHeight); //왼쪽 바 그리기 바는 위아래로만 움직이므로 y값만 키보드 입력으로 설정
				g2d.fillRect(barRightPos.x, barRightPos.y, 20, barHeight); // 오른쪽 바 그리기
				g2d.setFont(new Font("TimesRoman", Font.BOLD, 50)); //폰트 지정
				g2d.drawString(scoreLeft + " vs " + scoreRight, 400-50, 50); //문자열 넣기
				g2d.fillOval(ballPos.x, ballPos.y, 20, 20); //공 위치와 크기 지정하기
			}
		}
		//변수 지정
		static Timer timer = null; 
		static int dir = (int) (Math.random()*4); //최초 공의 방향 정하기 랜덤함수를 사용해서 0 ~ 3 까지 랜덤하게 설정하도록함.
		static Point ballPos = new Point(400-10, 200-10); //최초 공 위치
		static final int BALL_SPEED = 5; // 공의 기본 이본속도
		static float ballSpeedX = BALL_SPEED; //공의 x축 이동속도
		static float ballSpeedY = BALL_SPEED; // 공의 y축 이동속도
		static int ballWidth = 20; //공 넓이
		static int ballHeight = 20; // 공 높이
		static int barWidth = 20;
		static int barHeight = 80;
		static Point barLeftPos = new Point(50, 200-40); //왼쪽 바 위치설정
		static Point barRightPos = new Point(800-50-20, 200-40); //오른쪽 바 위치설정
		static int barLeftYTarget = barLeftPos.y; //왼쪽 바 목표 값
		static int barRightYTarget = barRightPos.y; //오른쪽 바 목표 값 부드럽게 이동하기위해서 
		static MyPanel myPanel = null;
		static int scoreLeft = 0;
		static int scoreRight = 0;

		public MyFrame(String title) { //환경설정
			super(title); //제목은 메인에 입력하였음.
			this.setVisible(true); // 프레임 보이도록
			this.setSize(800, 430); //사이즈는 800, 400 설정
			this.setLayout(new BorderLayout()); //레이아웃은 보더레이아웃으로 해서 패널을 프레임 중앙에 위치하도록 함.
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			myPanel = new MyPanel(); // MyPanel의 새 인스턴스 myPanel 생성
			this.add("Center", myPanel); //센터에 myPanel인스턴스를 추가

			setKeyListener(); //키리스너 실행
			startTimer(); //타이머 실행
		}

		public void setKeyListener() { //키 리스너 생성
			this.addKeyListener(new KeyListener() { //키리스너 추가하기 (KeyAdapter로 할 수도 있는데 자동으로 오버라이드 해주니까 리스너로 했음.)

				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_UP) { //키 이벤트로 Up키가 눌리면
						System.out.println("Pressed Up Key"); //다음 문자열 출력하고
						barLeftYTarget -= 10;	// 왼쪽 바(barLeftYTarget = barLeft의 Y포지션)를 -10 한다. (현재 프레임에서 y포지션은 낮을 수록 화면 상단)
						if(barLeftPos.y < barLeftYTarget) { // 타겟값이 변동하기때문에 bar의 y값을 타겟값과 같도록 비교한다. 이미 변수로 선언되었지만 논리값과 UI값을 따로 설정해준다고 한다.
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
				public void keyTyped(KeyEvent e) { //안쓰는 메서드
					// TODO Auto-generated method stub

				}

				@Override
				public void keyReleased(KeyEvent e) { //안쓰는 메서드
					// TODO Auto-generated method stub

				}


			});
		}
		public void startTimer() {
			timer = new Timer(15, new ActionListener() { //화면 딜레이 값과 액션리스너 생성

				@Override
				public void actionPerformed(ActionEvent e) { //타이머 이벤트
					if(barLeftPos.y > barLeftYTarget) {
						barLeftPos.y -= 5;
						barRightPos.y -= 5;
					}else if (barLeftPos.y < barLeftYTarget) {
						barLeftPos.y += 5;
						barRightPos.y += 5;
					}
					if(barLeftPos.y > 400 - barHeight)
						barLeftPos.y = 400 - barHeight;

					if(dir ==0) {  // 0 == 공이 오른쪽 위로갈 때 
						ballPos.x += ballSpeedX;
						ballPos.y -= ballSpeedY;
					}else if (dir ==1) { // 1 == 공이 오른쪽 아래로
						ballPos.x += ballSpeedX;
						ballPos.y += ballSpeedY;
					}else if (dir ==2) { // 2 == 공이 왼쪽 위로
						ballPos.x -= ballSpeedX;
						ballPos.y -= ballSpeedY;
					}else if (dir ==3) { // 3 == 공이 왼쪽 아래로
						ballPos.x -= ballSpeedX;
						ballPos.y += ballSpeedY;
					}
					checkCollision(); //충돌체크
					myPanel.repaint(); //화면 갱신
				}

			});
			timer.start(); //타이머를 시작하기
		}
		public void setSpeed(Point barPos) { //바 위치에 따라 각도와 스피드 조절
			int barCenerY = barPos.y + (barHeight/2); //바의 y 센터값 설정
			int ballCenterY = ballPos.y + (ballHeight/2); //공의 y 센터값
			
			float offset = Math.abs(barCenerY - ballCenterY); //바와 공의 y값을 뺀 절대 값(공이 바의 중앙에 맞았는지 가장자리에 맞았는지 확인)
			// offset값이 0이면 중앙에 맞았단 얘기 40에 갈수록 가장자리 
			float offsetRate = (offset * 1.5f) / (barHeight / 2); //바 높이의 절반을 다시 나눠 레이팅함. 0 ~ 1.0 까지 나오게 됨. 
			if(offsetRate < 0.1f )
				offsetRate = 0.1f;
			if(offsetRate > 1.5f)
				offsetRate = 1.5f;
			ballSpeedY = BALL_SPEED * offsetRate; //y축 BALL_SPEED에 offsetRate를 곱해서 각도와 속도가 변하게 설정 
			if(ballSpeedY <1) // 공의 y축 속도가 너무 느리지 않도록 최소 속도 지정해줌
				ballSpeedY = 1;
		}
		
		public void checkCollision() {
			if(dir == 0) { // 0은 오른쪽 위
				if(ballPos.y < 0) { // 공의 y값이 0보다 작을 경우 (위쪽 경계에 닿은 경우)
					dir = 1;   // 공의 방향은 오른쪽 아래로 변경
				}
				if(ballPos.x > 800 - barWidth) { // 공의 x값이 800을 초과한 경우(프레임 오른쪽 경계에 닿을경우)
					dir = 2;   // 공의 방향은 왼쪽 위로 변경
					scoreLeft += 1 ;
				}
				if(ballPos.x > barRightPos.x - barWidth && (ballPos.y >= barRightPos.y && ballPos.y <= barRightPos.y + barHeight)) {
					// 공의 x값이 바의 x값 - 공의 너비보다 크고 && ( 공의 y값이 바의 y값 이상이고, 공의 y값이 바 높이 이하일경우 )
					dir = 2;
					setSpeed(barRightPos);
				}
			}
			if(dir == 1) { // 1은 오른쪽 아래
				if(ballPos.y > 400 - ballHeight) { // 공의 y값이 400을 초과한 경우(프레임 아래 경계에 닿은 경우)
					dir = 0;
				}
				if(ballPos.x > 800 - (ballWidth)) { //공의 x값이 800을 초과한 경우
					dir = 3;
					scoreLeft += 1 ;
				}
				if(ballPos.x > barRightPos.x - barWidth && (ballPos.y >= barRightPos.y && ballPos.y <= barRightPos.y + barHeight)) {
					dir = 3;
					setSpeed(barRightPos);
				}
			}
			else if (dir == 2) { // 2는 왼쪽 위
				if(ballPos.y < 0) { // 공의 y값이 0 미만인 경우
					dir = 3;
				}
				if(ballPos.x < 0) { // 공의 x값이 0 초과인 경우
					dir = 0;
					scoreRight += 1 ;
				}
				if(ballPos.x < barLeftPos.x + barWidth && (ballPos.y >= barLeftPos.y && ballPos.y <= barLeftPos.y + barHeight)) {
					dir = 0;
					setSpeed(barLeftPos);
				}
			}
			else if (dir == 3) { // 3은 왼쪽 아래
				if(ballPos.y > 400 - ballHeight) { // 공의 y값이 400을 초과한 경우
					dir = 2;
				}
				if(ballPos.x <0 ) { // 공의 x값이 0 미만인 경우
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
