package moviereserve_review;

public class NoneDicountPolicy implements DiscountPolicy {

	@Override
	public Money calculateDiscountAmount(Screening screening) {
		return Money.ZERO;
	}

}
