package moviereseve;

public class Movie {

	private Money fee;
	private String title;
	
	public Movie(String title, Money fee) {
		this.title = title;
		this.fee = fee;
	}
	
	public Money getFee() {
		return fee;
	}
	
}
