package abstraction;

public class Granduer extends Car {

	@Override
	public void start() {
		System.out.println("그랜져가 시동을 겁니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("그랜져가 앞으로 갑니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("그랜져가 멈춥니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("그랜져가 시동을 끕니다.");
		
	}
	
}
