package moviereserve2;

import java.time.Duration;

public class PercentDiscountPolicy extends Movie {

	private double percent;
	
	public PercentDiscountPolicy(String title, Duration runningTime, Money fee, double percent, DiscountCondition[] discountConditions) {
		super(title, runningTime, fee, discountConditions);
		this.percent = percent;
	}

	@Override
	protected Money calculateDiscountAmount() {
		return getFee().times(percent);
	}

}
