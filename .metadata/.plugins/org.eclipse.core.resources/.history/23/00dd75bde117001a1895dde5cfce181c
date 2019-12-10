package moviereserve2;

import java.time.LocalDateTime;

public class Screening {

	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;
	
	
	/* 
	 * 상영은 외부에서 예매하라의 요청에 대해 예매 객체를 창조하는 응답을 할 수 있어야한다.
	 * 이 안에서 예매 인스턴스를 생성한다.
	 */
	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}
	
	/*
	 * Movie로 가격을 계산해서 리턴하라는 메시지를 보낸다.
	 */
	public Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
	
	public LocalDateTime getWhenScreened() {
		return whenScreened;
	}
	
	public int getSequence() {
		return sequence;
	}
	
}
