package abstractex;

public class DeskTop extends Computer {

	//�Ѵ� �����ؾ� �Ϲ� Ŭ������ �� �� �ִ�.
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("desktop turnoff");
	}
	
}
