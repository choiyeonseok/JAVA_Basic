package cooperation;

public class CooperationTest {

	public static void main(String[] args) {
		
		Student yeon = new Student("연석", 10000);
		Bus bus100 = new Bus();
		
		yeon.takeBus(bus100);
		yeon.showInfo();
		System.out.println();
		
		Student seok = new Student("석연", 5000);
		seok.takeBus(bus100);
		seok.showInfo();
		System.out.println();
		
		Student kim = new Student("킴리", 3000);
		Subway greenLine = new Subway();
		kim.takeSubway(greenLine);
		kim.showInfo();
		
	}

}
