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
