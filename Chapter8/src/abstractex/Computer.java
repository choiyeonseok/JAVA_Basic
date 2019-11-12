package abstractex;

public abstract class Computer {

	public abstract void display(); //하위 클래스에서 기능을 구현한다.
	public abstract void typing(); //하위 클래스에서 기능을 구현한다.
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
