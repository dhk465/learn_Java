package ex1_frame;

import java.awt.Frame;

import javax.swing.JFrame;

public class Ex2_FrameTest {
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("ȯ���մϴ�.");
		
		jf.setSize(400, 400); // �ʺ�, ���� ���� ����
		
		jf.setLocation(500, 100); // ������ xy ���� ����
		
		// ���� X��ư���� ������ �ݱ�
		// �� ����� JFrame���θ� ����
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}
}
