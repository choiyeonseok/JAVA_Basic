package classpart;

public class StudentTest {

	public static void main(String[] args) {
		

		Student studentLee = new Student(123, "�̼���");
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student("������");
		studentKim.address = "����";
		
		studentLee.showStudentInfo();
		int leeID = studentLee.getStudentID();
		
		
		System.out.println(leeID);
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
