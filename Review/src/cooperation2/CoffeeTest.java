package cooperation2;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("�� ����", 10000);
		Person lee = new Person("�� �ǰ�", 15000);
		
		Cafe starCafe = new Cafe("���ٹ�");
		Cafe beanCafe = new Cafe("��ٹ�");
		
		kim.buyAmericano(starCafe);
		lee.buyLatte(beanCafe);

		
		kim.showInfo();
		lee.showInfo();
		System.out.println();
		
		starCafe.showInfo();
		beanCafe.showInfo();
		
	}
}