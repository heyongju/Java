package gamelevel;

public class Player {
	private PlayerLevel level; //Player�� ������ level ���� ����
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();  //����Ʈ ������, ó�� �����Ǹ� beginnerLevel�� �����ϸ� ���� �޽��� ���
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
