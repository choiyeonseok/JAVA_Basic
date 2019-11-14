package interfaceex;

public class Priority implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("중요한 순서대로 숙련도가 높은 상담원에게 배분합니다.");
		
	}

}
