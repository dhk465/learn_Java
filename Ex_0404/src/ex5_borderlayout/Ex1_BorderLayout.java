package ex5_borderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_BorderLayout {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		Button btn1 = new Button("ºÏ");
		Button btn2 = new Button("¼­");
		Button btn3 = new Button("Áß¾Ó");
		Button btn4 = new Button("µ¿");
		Button btn5 = new Button("³²");
		Button btn6 = new Button("¹öÆ°6");
		
		f.setLayout(new BorderLayout());
		
		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.WEST);
		f.add(btn3, BorderLayout.CENTER);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.SOUTH);
		//f.add(btn6, "Center");
		
		f.setBounds(500, 100, 400, 400);
		
		f.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		
		});
		
		f.setVisible(true);
		
	}
}
