package ex4_flowlayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFlowLayout {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 300, 500, 500);
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button b10 = new Button("10");
		
		f.setLayout(new FlowLayout());
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				System.exit(0);
				
			}
		
		});
		
	}
}
