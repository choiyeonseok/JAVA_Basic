package staticex;

public class StudentTest {

	public static void main(String[] args) {
		
		
		//여기서 serialNum은 static 변수가 된다.
		//각 개체는 같은 serialNum의 메모리를 바라보고 있다.
		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());  //static변수이므로 클래스이름으로 접근해야함
		
		Student studentKim = new Student("Kim");  
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		System.out.println(studentLee.getStudentID());  //1001
		System.out.println(studentKim.getStudentID());  //1002

	}
}
