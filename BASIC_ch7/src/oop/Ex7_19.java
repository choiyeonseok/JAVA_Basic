package oop;

class Buyer{
	
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p.toString() + "��/�� ��� �����ϴ�.");
			return;
		}
		else {
			money -= p.price;
			this.add(p);
		}
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			Product[] cart2 = new Product[cart.length * 2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart = cart2;
		}
		cart[i] = p;
		i += 1;
	}
	
	void summary() {
		int total = 0;
		System.out.print("������ ���� : ");
		for(Product p: cart) {
			if(p == null)
				break;
			total += p.price;
			System.out.print(p.toString()+",");
		}
		System.out.println();
		System.out.println("����� �ݾ� : " + total);
		System.out.println("���� �ݾ� : " + money);
	}
	
}

class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product{
	Tv(){ super(100);}
	
	public String toString() { return "Tv";}
}

class Computer extends Product{
	Computer(){ super(200);}
	
	public String toString() { return "Computer";}
}

class Audio extends Product{
	Audio() { super(50);}
	
	public String toString() { return "Audio";}
}
public class Ex7_19 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();


	}

}
