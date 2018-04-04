package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_FrameTest {
	public static void main(String[] args) {
		
		Frame frame = new Frame("첫 프레임"); // 생성자 Overloading: 프레임 제목
		
		frame.setBounds(800, 100, 400, 300); // 오프셋 x 800 오프셋 y 100 너비 400 높이 300
		frame.setBackground(Color.BLUE); // 배경색 지정
		
		frame.setVisible(true); // true로 세팅해야 화면에 표시됨
		
	}
}
