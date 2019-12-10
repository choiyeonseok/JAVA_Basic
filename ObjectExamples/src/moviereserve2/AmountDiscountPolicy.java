package moviereserve2;

import java.time.Duration;

public class AmountDiscountPolicy extends Movie{

	private Money discountAmount;
	
	public AmountDiscountPolicy(String title, Duration runningTime, Money fee, Money discountAmount, DiscountCondition... discountConditions) {
		super(title, runningTime, fee, discountConditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money calculateDiscountAmount() {
		return discountAmount;
	}
	
}
