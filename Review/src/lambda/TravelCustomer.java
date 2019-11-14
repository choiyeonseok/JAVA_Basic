package lambda;

public class TravelCustomer {

	private String name;
	private int age;
	private int cost;
	
    public TravelCustomer(String name, int age, int cost) {
    	this.name = name;
    	this.age = age;
    	this.cost = cost;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public void showInfo() {
		System.out.println(name + "고객님의 비용은 " + cost + "원 입니다.");
		
	}
	
	public String toString() {
		return name + ", " + age + ", " +cost;
	}
	
	
}
