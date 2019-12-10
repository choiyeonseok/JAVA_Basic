package moviereserve_review;

public interface DiscountPolicy {

	Money calculateDiscountAmount(Screening screening);
	
}
