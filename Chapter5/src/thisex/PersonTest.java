package thisex;

public class PersonTest {

	public static void main(String[] args) {

		Person personNoname = new Person();
		personNoname.showInfo();
		System.out.println(personNoname);
		
		Person personLee = new Person("Lee", 34);
		personLee.showInfo();
		System.out.println(personLee); //��ü�� �ּҸ� ����Ų��.
		
		Person p = personLee.getSelf();
		System.out.println(p); //��ü�� �ּҸ� ����Ų��.
		
	}

}
