package abstraction;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player yeon = new Player();
		yeon.play(1);
		System.out.println();
	
		PlayerLevel alevel = new AdvancedLevel();
		yeon.upgradeGrade(alevel);
		yeon.play(2);
		System.out.println();
		
		PlayerLevel slevel = new SuperLevel();
		yeon.upgradeGrade(slevel);
		yeon.play(3);
		System.out.println();
	}

}
