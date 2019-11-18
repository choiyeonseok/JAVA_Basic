package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Studentn{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total;
	int schoolRank;
	
	Studentn(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f) * 10 + 0.5) /10f;
	}
	
	
	public String toString() {
		return name
				+"," + ban
				+"," + no
				+"," + kor
				+"," + eng
				+"," + math
				+"," + getTotal()
				+"," + getAverage()
				;
	}

}

class ClassTotalComparator implements Comparator{
	public int comapre(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		return (s1.ban == s2.ban) ? s1.no - s2.no : s1.ban - s2.ban; //�� ���� ���� ����
	}

	}
}

class BanNoAscending implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			int result = s1.ban - s2.ban;
			
			if(result == 0) {
				return s1.no - s2.no;
			}
			// return s1.ban == s2.ban ? s1.no-s2.no : s1.ban-s2.ban;
			return result;
		}
		return -1;
	}
}


public class Ex11_7 {

	public static void calculateSchoolRank(List list) {
		Collections.sort(list);
		
		int prevRank = -1; //�������
		int prevTotal = -1;// ���� ����
		int length = list.size();
		
		
		//1. �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´�.
		for(int i=0; i <length; i++) {
			Studentn s = (Studentn)list.get(i);
			
			//1.1. ������ ���� ������ ������ ���� ����� ������Ѵ�.
			if (s.total == prevTotal) {
				s.schoolRank = prevRank;
			}else { //1.2. ������ ���� �ٸ���, ����� ���� �˸°� �����Ѵ�. (������ �� ���)
				s.schoolRank = i+1;
			}
			
			//1.3. ���� ������ ����� ���� ������ ���� ����� �����Ѵ�.
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Studentn> list = new ArrayList<Studentn>();
		
		list.add(new Studentn("���ڹ�",2,1,70,90,70)); 
		list.add(new Studentn("���ڹ�",2,2,60,100,80)); 
		list.add(new Studentn("ȫ�浿",1,3,100,100,100)); 
		list.add(new Studentn("���ü�",1,1,90,70,80)); 
		list.add(new Studentn("���ں�",1,2,80,80,90));
		
		
		calculateSchoolRank(list);

		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
