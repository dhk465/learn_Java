package ex1_frame;

import java.awt.Color;

public class Ex4_FrameTest {
	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame("Welcome");
		
		mf.setBackground(Color.DARK_GRAY);
		
		// �����ӿ� x��ư Ŭ���� ���� �ϴ� �̺�Ʈ ������ ���
		mf.addWindowListener(new MyEventListener());
		
	}
}
