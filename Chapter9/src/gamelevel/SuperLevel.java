package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���ö� ���� �޸��ϴ�.");

	}

	@Override
	public void jump() {
		System.out.println("�� ���� ����մϴ�.");

	}

	@Override
	public void turn() {
		System.out.println("�ѹٲ� ���ϴ�.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** ����� �����Դϴ�. *****");

	}

}
