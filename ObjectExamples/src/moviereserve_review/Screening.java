package moviereserve_review;

import java.time.LocalDateTime;

public class Screening {

	private Movie movie;
	private LocalDateTime whenScreenend;
	private int sequence;
	
	public Screening(Movie movie, int sequence, LocalDateTime whenScreenend) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreenend = whenScreenend;
	}
	
	public Money getMovieFee() {
		return movie.getFee();
	}
	
	public int getSequence() {
		return sequence;
	}
	
	public LocalDateTime getStartTime() {
		return whenScreenend;
	}
	
	public Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
	
	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}
	
}
