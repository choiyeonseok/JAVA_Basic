package moviereseve;

public class SequenceCondition implements DiscountCondition{

	private int sequence;
	
	public SequenceCondition(int sequence) {
		this.sequence = sequence;             //�ʱⰪ (����)
	}
	
	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}

}
