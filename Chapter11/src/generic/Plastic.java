package generic;

public class Plastic extends Material {

	public String toString() {
		return "재료는 Plastic입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic 으로 프린트합니다.");
	}
	
}
