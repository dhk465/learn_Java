package ex1_frame;

import java.awt.Frame;

import javax.swing.JFrame;

public class Ex2_FrameTest {
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("환영합니다.");
		
		jf.setSize(400, 400); // 너비, 높이 따로 지정
		
		jf.setLocation(500, 100); // 오프셋 xy 따로 지정
		
		// 우상단 X버튼으로 프레임 닫기
		// 이 기능은 JFrame으로만 가능
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}
}
