package abstraction;

public class Genesis extends Car{
	
	@Override
	public void start() {
		System.out.println("���׽ý��� �õ��� �̴ϴ�.");
		
	}

	@Override
	public void drive() {
		System.out.println("���׽ý��� ������ ���ϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println("���׽ý��� ����ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("���׽ý��� �õ��� ���ϴ�.");
		
	}
	
}
