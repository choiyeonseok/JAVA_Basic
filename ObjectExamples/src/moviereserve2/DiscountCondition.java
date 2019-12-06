package moviereserve2;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {

	private DiscountConditionType type;
	private int sequence;
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;

	
	/*
	 * 새로운 조건 타입 추가시 if문을 수정해야한다. => 그래서 다형성으로 구현하는게 맞는 것이다. => 클리스 분리를 필요로한다.
	 */
	public boolean isSatisfiedBy(Screening screening) {
		if (type == DiscountConditionType.PERIOD) {
			return isSatisfiedByPeriod(screening);
		}
		
		return isSatisfiedBySequence(screening);
	}
	
	private boolean isSatisfiedByPeriod(Screening screening) {
		return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
				startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
				endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
	}
	
	private boolean isSatisfiedBySequence(Screening screening) {
		return sequence == screening.getSequence();
	}
	
}
