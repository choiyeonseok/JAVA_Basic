package thisex;

public class PersonTest {

	public static void main(String[] args) {

		Person personNoname = new Person();
		personNoname.showInfo();
		System.out.println(personNoname);
		
		Person personLee = new Person("Lee", 34);
		personLee.showInfo();
		System.out.println(personLee); //객체의 주소를 가리킨다.
		
		Person p = personLee.getSelf();
		System.out.println(p); //객체의 주소를 가리킨다.
		
	}

}
