package classpart;

public class StudentTest {

	public static void main(String[] args) {
		

		Student studentLee = new Student(123, "이순신");
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student("김유신");
		studentKim.address = "경주";
		
		studentLee.showStudentInfo();
		int leeID = studentLee.getStudentID();
		
		
		System.out.println(leeID);
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
