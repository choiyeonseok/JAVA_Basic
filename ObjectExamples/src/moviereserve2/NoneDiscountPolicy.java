package moviereserve2;

import java.time.Duration;

public class NoneDiscountPolicy extends Movie{

	public NoneDiscountPolicy(String title, Duration runningTime, Money fee, DiscountCondition[] discountConditions) {
		super(title, runningTime, fee, discountConditions);
	}

	@Override
	protected Money calculateDiscountAmount() {
		return Money.ZERO;
	}

}
