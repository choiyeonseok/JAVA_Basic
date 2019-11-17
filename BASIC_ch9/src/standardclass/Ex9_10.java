package standardclass;

public class Ex9_10 {

	public static String format(String str, int length, int alignment) {
		if (length < str.length())
			return str.substring(0, length);
		else {
			char[] chArr = new char[length];
			for(int i=0; i<length; i++)
				chArr[i] = ' ';
			
			if(alignment==0)
				System.arraycopy(str.toCharArray(), 0, chArr, 0, str.length());	
			else if(alignment==1)
				System.arraycopy(str.toCharArray(), 0, chArr, (int)(length-str.length())/2, str.length());
			else 
				System.arraycopy(str.toCharArray(), 0, chArr, length-str.length(), str.length());
				
			return new String(chArr);
		}
	}
	
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬


	}

}
