package standardclass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_14 {

	public static void main(String[] args) {
		
		String[] phoneNumArr = {
			"012-3456-7890",
			"099-2456-7980",
			"088-2346-9870",
			"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			
			if(input.equals("")) {
				continue;
			} 
			else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
		
			//
			String pattern = ".*" + input + ".*"; //input을 포함하는 모든 문자열
			Pattern p = Pattern.compile(pattern);
			
			for(int i=0; i<phoneNumArr.length; i++) {
				String phoneNum = phoneNumArr[i];
				String tmp = phoneNum.replace("-",  "");
				
				Matcher m =p.matcher(tmp);
				
				if(m.find()) {
					list.add(phoneNum);
				}
			}
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다."); 
			}
			
		}

	}
}