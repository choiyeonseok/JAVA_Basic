package abstraction;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("��û ���� jump�մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn �� �� �ֽ��ϴ�.");
		
	}
	
	@Override
	public void showPlayerLevel() {
		System.out.println("����� �����Դϴ�.");
		
	}
}
