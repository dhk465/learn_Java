package ex1_frame;

import java.awt.Color;

public class Ex4_FrameTest {
	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame("Welcome");
		
		mf.setBackground(Color.DARK_GRAY);
		
		// 프레임에 x버튼 클릭을 감지 하는 이벤트 감지자 등록
		mf.addWindowListener(new MyEventListener());
		
	}
}
