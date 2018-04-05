package ex4_layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(new BorderLayout());
		
		f.isUndecorated();
		
		// ��ư�� �迭�� �غ�
		Button[] btns = new Button[5];
		String[] btnText = {"�ݱ�", "����", "���", "Ȯ��", "�ȳ�"};

		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button(btnText[i]);
		}
		
		f.add(btns[0], BorderLayout.EAST);
		f.add(btns[1], BorderLayout.WEST);
		f.add(btns[2], BorderLayout.SOUTH);
		f.add(btns[3], BorderLayout.NORTH);
		f.add(btns[4], BorderLayout.CENTER);
		
		// frame�� �߰��� ���� ��ŭ�� ������ Ȯ��
		f.pack();
		
		f.setVisible(true);
		
		btns[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
	}
}
