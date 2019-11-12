package staticex;

public class Student {

	// 멤버변수, 속성들..
	private static int serialNum = 1000; //static변수는 private선언
	private int studentID;
	public String studentName;
	public String address;
	
	//public Student() {} // 기본생성자
	public Student(String name) { //이름만 받는 생성자
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	// 클래스이름과 같은 메서드 생성
	// 객체 생성시 멤버변수를 초기화할 수 있다.
	public Student(int id, String name) { //이름과 아이디를 받는 생성자
		studentID = id;
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}
