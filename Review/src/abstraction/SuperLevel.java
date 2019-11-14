package abstraction;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 할 수 있습니다.");
		
	}
	
	@Override
	public void showPlayerLevel() {
		System.out.println("상급자 레벨입니다.");
		
	}
}
