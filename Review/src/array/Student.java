package array;

import java.util.ArrayList;

public class Student {

	public int studentId;
	public String studentName;
	ArrayList<Subject> subjectList;
	ArrayList<Book> bookList;
	public int total = 0;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title) {
		bookList.add(new Book(title));
	}
	
	public void addSubject(String subjectName, int score) {
		subjectList.add(new Subject(subjectName, score));
	}
	
	
	public void showBookInfo() {
		System.out.print(studentName + "이 읽은 책은 ");
		for(Book book: bookList) {
			System.out.print(book.getTitle() + " "); 
		}
		System.out.println("입니다.");
	}
	
	public int retTotal() {
		for(Subject subject: subjectList) {
			total += subject.getScore();
			System.out.println(subject.getSubjectName() + "과목의 성적은 " + subject.getScore() + "입니다.");
		}
		return total;
	}
	
}
