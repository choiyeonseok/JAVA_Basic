package ticketselling;

public class Bag {

	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	
	public Bag(long amount) {
		this(null, amount);
	}
	
	/**
	 * �������� ����ǰ�� ���ݰ� �ʴ��� �Ѵ� �����ϰ� �ְų�, ���ݸ� �����ϰ� �ְų�.
	 * @param invitation
	 * @param amount
	 */
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
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
	
	private boolean hasInvitation() {
		return invitation != null;
	}
	
	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}


}
