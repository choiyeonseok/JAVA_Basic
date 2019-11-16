package oop;

class Student{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		float total = getTotal();
		return Float.parseFloat(String.format("%.1f",total/3.0f));
	}
	
	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
	}
	
}


public class Ex6_3 {
	
	public static void main(String[] args) {

		Student s = new Student("ȫ�浿",1,1,100,60,76);
		System.out.println("�̸� :"+s.name); 
		System.out.println("���� :"+s.getTotal()); 
		System.out.println("��� :"+s.getAverage());
		System.out.println(s.info());
	}

}
