package paractice1;

public class AdvancedLevel extends PlayerLevel{

	
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	@Override
	public void jump() {
		System.out.println("jump �Ҽ� �ִ�.");
	}
	
	@Override
	public void turn() {
		System.out.println("turn ��������");
	}
	
	@Override
	public void showPlayerLevel() {
		System.out.println("****** �߱��� �����Դϴ�. ******");
	}
	
}
