package moviereserve_review;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

	private Money amount;

	public AmountDiscountPolicy(Money amount, DiscountCondition ...conditions) {
		super(conditions);
		this.amount = amount;
	}
	
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return amount;
	}
	
}
