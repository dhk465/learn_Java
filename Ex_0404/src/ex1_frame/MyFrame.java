package ex1_frame;

import java.awt.Frame;

public class MyFrame extends Frame {
	
	public MyFrame() {
		
		setBounds(500, 200, 400, 400);
		setVisible(true);
	
	}
	
	public MyFrame(String str) {
	
		setTitle(str);
		setBounds(500, 200, 400, 400);
		setVisible(true);
	
	}
	
}
