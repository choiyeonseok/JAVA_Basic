package stream.coffee_practice;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee coffee = new KenyaAmericano();
		coffee.brewing();
		System.out.println();
		
		Coffee latte = new Latte(new KenyaAmericano());
		latte.brewing();
		System.out.println();
		
	}

}
