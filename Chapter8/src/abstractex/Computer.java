package abstractex;

public abstract class Computer {

	public abstract void display(); //���� Ŭ�������� ����� �����Ѵ�.
	public abstract void typing(); //���� Ŭ�������� ����� �����Ѵ�.
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
