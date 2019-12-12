package studentscore;

public class Professor {
	private String name;
	private Lecture lecture;
	
	public Professor(String name, Lecture lecture) {
		this.lecture = lecture;
		this.name = name;
	}
	
	public String compileStatistics() {
		return String.format("[%s] %s - Avg : %.1f", name, lecture.evaluate(), lecture.average());
	}
	
}
