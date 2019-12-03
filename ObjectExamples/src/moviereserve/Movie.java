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

// ������ ��� => ���¹���� ������.
//		if (discountPolicy == null) {
//			return fee;
//		}
		
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
	
}
