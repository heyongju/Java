package gamelevel;

public class Player {
	private PlayerLevel level; //Player가 가지는 level 변수 선언
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();  //디폴트 생성자, 처음 생성되면 beginnerLevel로 시작하며 레벨 메시지 출력
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
