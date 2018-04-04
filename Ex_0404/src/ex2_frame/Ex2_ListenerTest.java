package ex2_frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_ListenerTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 100, 300, 300);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				System.exit(0);
				
			}
			
		});
		
	}
}
