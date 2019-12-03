package moviereserve;

public interface DiscountCondition {

	boolean isSatisfiedBy(Screening screening);
}
