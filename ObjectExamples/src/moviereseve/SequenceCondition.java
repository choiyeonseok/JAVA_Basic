package moviereseve;

public class SequenceCondition implements DiscountCondition{

	private int sequence;
	
	public SequenceCondition(int sequence) {
		this.sequence = sequence;             //초기값 (고정)
	}
	
	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}

}
