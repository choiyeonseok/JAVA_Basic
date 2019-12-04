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
	
	private boolean hasInvitation() {
		return invitation != null;
	}
	
	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			minusAmount(ticket.getFee());
			setTicket(ticket);
			return ticket.getFee();
		}
	}


}
