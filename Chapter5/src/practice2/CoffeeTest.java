package practice2;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person Kim = new Person("������", 40000);
		Person Lee = new Person("���ǰ�", 50000);
		
		Coffee StarCoffee = new Coffee("���ٹ�");
		Coffee BeanCoffee = new Coffee("��ٹ�");
		
		Kim.buyCoffee(StarCoffee);
		Lee.buyCoffee(BeanCoffee);

		Kim.showInfo();
		Lee.showInfo();
		
		StarCoffee.showInfo();
		BeanCoffee.showInfo();

	}

}
