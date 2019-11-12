package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // 20.0 + 10 = 30.0
		
		System.out.println(dNum);
	}

}
