package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_FrameTest {
	public static void main(String[] args) {
		
		Frame frame = new Frame("ù ������"); // ������ Overloading: ������ ����
		
		frame.setBounds(800, 100, 400, 300); // ������ x 800 ������ y 100 �ʺ� 400 ���� 300
		frame.setBackground(Color.BLUE); // ���� ����
		
		frame.setVisible(true); // true�� �����ؾ� ȭ�鿡 ǥ�õ�
		
	}
}
