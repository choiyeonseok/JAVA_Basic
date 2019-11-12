package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름 없음", 1); // 초기값!
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름 :" + name + " 나이 : " + age);
	}
	
	public Person getSelf() { //자기 클래스 이름을 반환형으로 설정
		return this;
	}
	
}
