package ex2_frame;

import java.awt.Frame;

public class Ex1_FrameTest {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		f1.setBounds(500, 100, 300, 300);
		f1.setVisible(true);
		
		f1.addWindowListener(new WindowCloseListener()); // 종료 시키는 감지자를 전달
		
	}
}
