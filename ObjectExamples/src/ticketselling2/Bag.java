package ticketselling2;

public class Bag {

	private Long amount;
	private Ticket ticket;
	private Invitation invitation;
	
	public Bag(Long amount) {
		this(null, amount);
	}
	
	public Bag(Invitation invitation, Long amount) {
		this.amount = amount;
		this.invitation = invitation;
	}
	
	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public boolean hasInvitation() {
		return ticket != null;
	}
	
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
}
