package cooperation2;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("±è Á¹·Á", 10000);
		Person lee = new Person("ÀÌ ÇÇ°ï", 15000);
		
		Cafe starCafe = new Cafe("º°´Ù¹æ");
		Cafe beanCafe = new Cafe("Äá´Ù¹æ");
		
		kim.buyAmericano(starCafe);
		lee.buyLatte(beanCafe);

		
		kim.showInfo();
		lee.showInfo();
		System.out.println();
		
		starCafe.showInfo();
		beanCafe.showInfo();
		
	}
}