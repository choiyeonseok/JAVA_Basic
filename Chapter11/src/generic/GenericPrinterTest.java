package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);  // toString은 객체를 출력값으로 반환했 때 출력되는 것이다.

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);  // toString은 객체를 출력값으로 반환했 때 출력되는 것이다.
		
		powderPrinter.printing();		
		plasticPrinter.printing();
	}

}
