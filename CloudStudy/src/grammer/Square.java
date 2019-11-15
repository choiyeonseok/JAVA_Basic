package grammer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Die {
	private int maxNumber;
	
	public Die(int maxNumber) {
		this.maxNumber = maxNumber;
		System.out.println(maxNumber);
	}
	
	public int roll() {
		Random rand = new Random();
		return rand.nextInt(maxNumber);
	}
}

public class Square {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Die die = new Die(N);
		
		for(int i=0; i<1000; i++) {
			arr.add(die.roll() + 1);
		}
		
		double avg = average(arr);
		System.out.printf("주사위 넘버 1000번의 총 평균은 " + String.format("%.2f", avg) + "입니다.");
	}
	
	public static double average(ArrayList<Integer> arr) {
		double total = 0;
		for(Integer num: arr) {
			total += num;
		}
		return total/arr.size();
	}
}
