package abstraction;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 아직 못하지롱.");
		
	}
	
	@Override
	public void showPlayerLevel() {
		System.out.println("중급자 레벨입니다.");
		
	}
	
}
