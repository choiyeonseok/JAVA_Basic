package staticex;

public class StudentTest {

	public static void main(String[] args) {
		
		
		//���⼭ serialNum�� static ������ �ȴ�.
		//�� ��ü�� ���� serialNum�� �޸𸮸� �ٶ󺸰� �ִ�.
		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());  //static�����̹Ƿ� Ŭ�����̸����� �����ؾ���
		
		Student studentKim = new Student("Kim");  
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		System.out.println(studentLee.getStudentID());  //1001
		System.out.println(studentKim.getStudentID());  //1002

	}
}
