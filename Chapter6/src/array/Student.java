package array;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		//과목 인스턴스를 담을 subjectList이름의 arrayList 인스턴스 생성
		subjectList = new ArrayList<Subject>();
	
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for( Subject subject : subjectList ) {
			
			total += subject.getScore();
			System.out.println( studentName + "학생의 " + subject.getName() + "과목의 성적은 " + subject.getScore() + "점 입니다.");
		
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
