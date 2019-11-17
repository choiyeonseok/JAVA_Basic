package oop;

import java.awt.*;
import java.awt.event.*;

public class Ex7_28 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {  //EventHandler라는 중간 클래스의 이름이 사라짐.
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}

}
