package staticex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() { // �ܺ� ��� ȣ��Ǿ ��ü �ν��Ͻ��� �ϳ��� �����. ����~ 
		
		if( instance == null ) {
			instance = new Company();
		}
		return instance;
	}
	
}
