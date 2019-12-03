package moviereserve;

import java.time.Duration;

public class Movie {

	private Money fee;
	private String title;
	private Duration runningTime;
	private DiscountPolicy discountPolicy;
	
	public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountPolicy = discountPolicy;
	}
	
	public Money getFee() {
		return fee;
	}
	
	public Money calculateMovieFee(Screening screening) {

// 안좋은 방식 => 협력방식이 무너짐.
//		if (discountPolicy == null) {
//			return fee;
//		}
		
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
	
}
