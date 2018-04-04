package ex1_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex3_FrameTest {
	public static void main(String[] args) {
		
		// 1. �������� ������� �ػ󵵸� ��´�
		// 2. ������� �߾� ��ǥ�� �ľ��Ѵ�
		// 3. �������� �¿� ũ�⸦ �߾� ��ǥ���� ���ش�
		
		Frame frame = new Frame();
		
		int width = 400;
		int height = 400;
		
		frame.setSize(width, height);
		
		// Toolkit Ŭ������ ���ؼ� ������� �ػ� ������
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		
		int monitorWidth = dim.width;
		int monitorHeight = dim.height;
		
		frame.setLocation((monitorWidth / 2) - (width / 2), (monitorHeight / 2) - (height / 2));
		
		frame.setVisible(true);
	}
}
