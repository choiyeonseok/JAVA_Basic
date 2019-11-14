package interfaceex;

import java.io.IOException;

public class SchedulerTest {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("���� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("P : �켱������ ���� �� �������");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r')
			scheduler = new RoundRobin();
		else if(ch == 'P' || ch == 'p')
			scheduler = new Priority();
		else
			System.out.println("�������� �ʴ� ����Դϴ�.");
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
	}

}
