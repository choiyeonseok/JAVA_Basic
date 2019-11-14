package abstraction;

public class Player {

	private PlayerLevel level;

	public Player() {
		level = new BeginnerLevel();
		level.showPlayerLevel();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeGrade(PlayerLevel level) {
		this.level = level;
		level.showPlayerLevel();
	}
	
	public void play(int n) {
		level.go(n);
	}
	
}
