package lambda;

                              //익명으로 함수가 호출되어 어떤 함수가 호출되는지 모르기 때문에
@FunctionalInterface          //추상메서드는 하나만 선언해야한다.
public interface MyMaxNumber {
	int getMaxNumber(int x, int Y);
}
