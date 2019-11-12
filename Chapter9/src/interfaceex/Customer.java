package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void order() {
		System.out.println("cusomer order");
	}

	@Override
	public void Sell() {
		System.out.println("customer sell");
	}

	@Override
	public void Buy() {
		System.out.println("customer buy");
	}
	
	public void sayHello() {
		System.out.println("hello");
	}
}
