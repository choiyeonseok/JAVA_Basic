package practice;

public class Customer {

	private String customerName;
	private int customerAge;
	private int cost;
	
	public Customer(String customerName, int customerAge, int cost) {
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.cost = cost;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerAge() {
		return customerAge;
	}


	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public void showInfo() {
		System.out.println(customerName + "°í°´´Ô " + "ºñ¿ëÀº " + cost + "¿ø ÀÔ´Ï´Ù.");
	}
	
	public String toString() {
		return customerName + "," + customerAge + "," + cost;
	}
}
