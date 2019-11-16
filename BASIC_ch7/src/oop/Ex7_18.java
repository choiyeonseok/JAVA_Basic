package oop;

class Robot{}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot{
	void Sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot{
	void Draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Ex7_18 {

	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}
		else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.Sing();
		}
		else if(r instanceof DrawRobot) {
			DrawRobot wr = (DrawRobot)r;
			wr.Draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++)
			action(arr[i]);
	}
	
}


