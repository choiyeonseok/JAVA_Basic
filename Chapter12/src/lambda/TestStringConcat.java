package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
	
		StringConcat concat = (x, y) -> System.out.println(x + "," + y);
		concat.makeString("ni", "hao");
		
		StringConcat concat2  = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1 + "," + s2);
				
			}
		};
		
		concat2.makeString("NI", "HAO");
	}
}
