package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
}


public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Shin);     //서로다른 메모리 주소의 객체
		System.out.println(Lee.equals(Shin));//논리적으로 같은 값임을 재정의해줘야함.
		
		System.out.println(Lee.hashCode());               // 해시 값 확인 100
		System.out.println(Shin.hashCode());              // 해시 값 확인 100
		
		System.out.println(System.identityHashCode(Lee)); // 실제 주소값 
		System.out.println(System.identityHashCode(Shin));// 실제 주소값
		
	}

}
