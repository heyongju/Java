package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("조올라 빨리 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("더 높이 잠뿌합니다.");

	}

	@Override
	public void turn() {
		System.out.println("한바꾸 돕니다.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");

	}

}
