package grammer;

class Developer{
	String name;
	int career;
	
	public Developer(String name, int career) {
		this.name = name;
		this.career = career;
	}
	
	public String level() {
		if (career < 3)
			return "�ʱ�";

		else if (career < 7)
			return "�߱�";
		else
			return "���";
	}
	
	public int salary() {
		if (level() == "�ʱ�")
			return 2800 + career * 100;
		else if (level() == "�߱�")
			return 3500 + career * 100;
		else
			return 4500 + career * 100;
	}
	
}

public class DeveloperTest {

	public static void main(String[] args) {
		
		Developer tom = new Developer("Tom", 2);
	    Developer john = new Developer("John", 5);
	    Developer sally = new Developer("Sally", 9);

	    System.out.println(tom.salary());
	    System.out.println(john.salary());
	    System.out.println(sally.salary());
	    
	}

}
