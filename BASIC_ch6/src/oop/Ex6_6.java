package oop;

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
    public double getDistance(int x1, int y1) {
		
		return Math.sqrt((double)(Math.pow(x-x1, 2) + Math.pow(y-y1, 2)));
		
	}
	
}

public class Ex6_6 {

	
	
	public static void main(String[] args) {
		
//		System.out.println(getDistance(1,1,2,2));

		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2,2));

	}

}
