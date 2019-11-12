package generic;

public class Powder extends Material {

	public String toString() {
		return "재료는 Powder입니다.";
	}
	
	@Override
	public void doPrinting() {
		System.out.println("Powder 으로 프린트합니다.");
	}
}
