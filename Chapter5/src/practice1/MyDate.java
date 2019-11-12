package practice1;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.isValid = isValid(day, month, year);
	}
	
	public boolean isValid(int day, int month, int year) {
		if (month < 1 || month > 12) {
			return false;
		}
		else {
			switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if (day < 1 || day > 31) return false;
					else {
						return true;
					}
				case 2:
					if (year % 4 == 0 && year % 100 != 0) {
						if (day < 1 || day > 29) return false;
					}
					else {
						if (day < 1 || day > 28) return false;
					}
				case 4: case 6: case 9: case 11:
					if (day < 1 || day > 30) return false;
					else {
						return true;
					}
			}
			return true;
		}
	}

	public void showDateInfo() {
		if (isValid) {
			System.out.println("유효한 날짜입니다.");
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		
	}
	
	
}
