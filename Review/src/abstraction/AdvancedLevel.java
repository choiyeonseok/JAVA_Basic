package abstraction;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("���� jump�մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn ���� ��������.");
		
	}
	
	@Override
	public void showPlayerLevel() {
		System.out.println("�߱��� �����Դϴ�.");
		
	}
	
}
