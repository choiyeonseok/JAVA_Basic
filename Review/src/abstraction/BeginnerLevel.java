package abstraction;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 아직 못하지롱.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 아직 못하지롱.");
		
	}

	@Override
	public void showPlayerLevel() {
		System.out.println("초급자 레벨입니다.");
		
	}

	
	
}
