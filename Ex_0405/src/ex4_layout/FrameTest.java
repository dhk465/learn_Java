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
		
		// 버튼을 배열로 준비
		Button[] btns = new Button[5];
		String[] btnText = {"닫기", "열기", "취소", "확인", "안녕"};

		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button(btnText[i]);
		}
		
		f.add(btns[0], BorderLayout.EAST);
		f.add(btns[1], BorderLayout.WEST);
		f.add(btns[2], BorderLayout.SOUTH);
		f.add(btns[3], BorderLayout.NORTH);
		f.add(btns[4], BorderLayout.CENTER);
		
		// frame에 추가된 내용 만큼만 영역을 확보
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
