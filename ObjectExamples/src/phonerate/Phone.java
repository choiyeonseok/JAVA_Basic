package phonerate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {

	private List<Call> calls = new ArrayList<>();
	private RatePolicy ratePolicy;	
	
	public Phone(RatePolicy ratePolicy) {
		this.ratePolicy = ratePolicy;
	}
	
	public List<Call> getCalls(){
		return Collections.unmodifiableList(calls);
	}
	
	public Money calculatePhoneFee() {
		return ratePolicy.calculateFee(this);
	}
	
}
