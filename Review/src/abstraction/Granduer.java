package abstraction;

public class Granduer extends Car {

	@Override
	public void start() {
		System.out.println("�׷����� �õ��� �̴ϴ�.");
		
	}

	@Override
	public void drive() {
		System.out.println("�׷����� ������ ���ϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println("�׷����� ����ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("�׷����� �õ��� ���ϴ�.");
		
	}
	
}
