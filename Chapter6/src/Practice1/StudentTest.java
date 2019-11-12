package Practice1;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addBook("태백산맥1");
		studentLee.addBook("태백산맥2");
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addBook("토지1");
		studentKim.addBook("토지2");
		studentKim.addBook("토지3");
		
		Student studentCho = new Student(1003, "Cho");
		studentCho.addBook("해리포터1");
		studentCho.addBook("해리포터2");
		studentCho.addBook("해리포터3");
		studentCho.addBook("해리포터4");
		studentCho.addBook("해리포터5");
		
		studentLee.showInfo();
		studentKim.showInfo();
		studentCho.showInfo();

	}

}
