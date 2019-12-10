package moviereserve_review;

public interface DiscountCondition {

	boolean isSatisfiedBy(Screening screening);
	
}
