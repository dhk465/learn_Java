package ex1_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex3_FrameTest {
	public static void main(String[] args) {
		
		// 1. 실행중인 모니터의 해상도를 얻는다
		// 2. 모니터의 중앙 좌표를 파악한다
		// 3. 프레임의 좌우 크기를 중앙 좌표에서 빼준다
		
		Frame frame = new Frame();
		
		int width = 400;
		int height = 400;
		
		frame.setSize(width, height);
		
		// Toolkit 클래스를 통해서 모니터의 해상도 얻어오기
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		
		int monitorWidth = dim.width;
		int monitorHeight = dim.height;
		
		frame.setLocation((monitorWidth / 2) - (width / 2), (monitorHeight / 2) - (height / 2));
		
		frame.setVisible(true);
	}
}
