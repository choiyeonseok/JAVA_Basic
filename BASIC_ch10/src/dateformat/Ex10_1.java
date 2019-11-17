package dateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // singleton ������ ����
		
		cal.set(2010, 0, 1); // cal�� ��¥�� 2010�� 1�� 1�Ϸ� �����Ѵ�.
		
		for(int i=0; i<12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK); //1���� ������ ���Ѵ�.
		
			
			// �� ��° �Ͽ����� 1���� ���Ͽ� ���� �޶����� .  
			// 1���� �Ͽ����� ��쿡�� �ι�° �Ͽ����� 8 ���̰�, 
			// 1���� �ٸ� ������ ����  16���� 1���� ����(weekday) ���� �� �� �ִ�.
			int secondSunday = (weekday == 1) ? 8: 16 - weekday;
			
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			//��¥�� ������ 1�Ϸ� �����Ѵ�.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
	}

}
