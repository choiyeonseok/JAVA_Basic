package reference;

	public class Student {
	
		int studentID;
		String studentName;
		
		Subject korea;
		Subject math;
		
		//생성자에서 참조를 바로 한다.
		public Student(int id, String name) {
			
			studentID = id;
			studentName = name;
			
			korea = new Subject();
			math = new Subject();
		}
		
		
		public void setKoreaSubject(String name, int score) {
			korea.subjectName = name;
			korea.score = score;
			
		}
		
		public void setMathSubject(String name, int score) {
			math.subjectName = name;
			math.score = score;
			
		}
		
		public void showStudentScore() {
			int total = korea.score + math.score;
			System.out.println("국어점수: " + korea.score);
			System.out.println("수학점수: " + math.score);
			System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
			
		}
		
	}
