package ex2_frame;

import java.awt.event.WindowEvent;

public class WindowCloseListener extends ListenerClass {

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	
}
