package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student yeon = new Student(100, "YEON SEOK");
		yeon.addSubject("����", 100);
		yeon.addSubject("����", 70);
		yeon.addSubject("����", 80);
		yeon.addSubject("����", 95);
		//total = 345;
		System.out.println(yeon.studentName + "�� ���� ������ " + yeon.retTotal() + "�Դϴ�.");
		
		yeon.addBook("�¹���1");
		yeon.addBook("�¹���2");
		yeon.addBook("�¹���3");
		yeon.addBook("�¹���4");
		yeon.addBook("�¹���5");
		
		yeon.showBookInfo();
		
		
	}

}
