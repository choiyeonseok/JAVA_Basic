package moviereserve;

public interface DiscountPolicy {

	Money calculateDiscountAmount(Screening screening);
	
}
