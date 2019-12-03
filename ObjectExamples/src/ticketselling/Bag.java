package ticketselling;

public class Bag {

	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	
	public Bag(long amount) {
		this(null, amount);
	}
	
	/**
	 * 관람객의 소지품은 현금과 초대장 둘다 소지하고 있거나, 현금만 소지하고 있거나.
	 * @param invitation
	 * @param amount
	 */
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}
	
	public boolean hasInvitation() {
		return invitation != null;
	}
	
	public boolean hasTicket() {
		return ticket != null;
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
	public void plusAmount(Long amount) {
		this.amount += amount;
	}

}
