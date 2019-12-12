package phonerate;

public interface RatePolicy {
	Money calculateFee(Phone phone);
}
