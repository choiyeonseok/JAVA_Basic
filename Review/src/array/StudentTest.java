package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student yeon = new Student(100, "YEON SEOK");
		yeon.addSubject("국어", 100);
		yeon.addSubject("수학", 70);
		yeon.addSubject("영어", 80);
		yeon.addSubject("과학", 95);
		//total = 345;
		System.out.println(yeon.studentName + "의 과목 총점은 " + yeon.retTotal() + "입니다.");
		
		yeon.addBook("태백산맥1");
		yeon.addBook("태백산맥2");
		yeon.addBook("태백산맥3");
		yeon.addBook("태백산맥4");
		yeon.addBook("태백산맥5");
		
		yeon.showBookInfo();
		
		
	}

}
