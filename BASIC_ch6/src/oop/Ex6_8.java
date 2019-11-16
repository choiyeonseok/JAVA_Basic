package oop;

class PlayingCard{
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}

}

public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayingCard card = new PlayingCard(1,1);
	}

}
