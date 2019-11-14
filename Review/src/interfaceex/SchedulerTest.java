package interfaceex;

import java.io.IOException;

public class SchedulerTest {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("상담원 할당 방식을 선택하세요");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("P : 우선순위가 높은 고객 순서대로");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r')
			scheduler = new RoundRobin();
		else if(ch == 'P' || ch == 'p')
			scheduler = new Priority();
		else
			System.out.println("지원되지 않는 기능입니다.");
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
	}

}
