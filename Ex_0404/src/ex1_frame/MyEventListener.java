package ex1_frame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEventListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("X버튼 클릭");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("원래대로 돌아옴");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// 최소화
		System.out.println("최소화 됨");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
