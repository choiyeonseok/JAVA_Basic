package baseballgame;

import java.util.ArrayList;
import java.util.List;

public class Computer {

	List<Integer> comNums;
	
	public Computer() {
		comNums = new ArrayList<>();
	}
	
	
	void createNumbers() {
		comNums.clear();
		while (comNums.size() < 3) {
			int tmp;
			tmp = (int)(Math.random() * 10);
			if (!comNums.contains(tmp) && tmp > 0)
				comNums.add(tmp);
		}
	}
	
	void showNumbers() {
		System.out.println(comNums);
	}
	
}
