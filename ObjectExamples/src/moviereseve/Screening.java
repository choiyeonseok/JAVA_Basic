package moviereseve;

import java.time.LocalDateTime;

public class Screening {

	private Movie movie;
	private int sequence; // ¼ø¹ø
	private LocalDateTime whenScreened;
	
	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}
	
	public LocalDateTime getStartTime() {
		return whenScreened;
	}
	
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}
	
	public Money getMovieFee() {
		return movie.getFee();
	}
	
}
