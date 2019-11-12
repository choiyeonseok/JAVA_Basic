package object;


class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate mydate = (MyDate)obj;
			if(this.day == mydate.day && this.month == mydate.month && this.year == mydate.year) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (int)((char)(day) + (char)(month) + (char)(year));
	}
	
}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);
		
		System.out.println(date1 == date2);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date1.hashCode() == date2.hashCode());
		
	}

}
