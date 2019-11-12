package staticex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() { // 외부 몇번 호출되어도 전체 인스턴스는 하나만 생긴다. 유일~ 
		
		if( instance == null ) {
			instance = new Company();
		}
		return instance;
	}
	
}
