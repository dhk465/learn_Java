package ex3_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonTest {
	public static void main(String[] args) {
		
		Frame f = new Frame("Button Test");
		
		f.setBounds(300, 200, 400, 400);
		
		// 프레임의 자동 배치를 끈다.
		f.setLayout(null);
		
		// 자동 배치를 끈 순간부터 frame에 추가되는 컴포넌트는
		// 고유의 사이즈와 위치정보를 가지고 있어야 한다
		Button btnOK = new Button("Confirm");
		
		btnOK.setBounds(70, 90,	100, 50);
		
		Button btnClose = new Button("Close");
		
		btnClose.setBounds(btnOK.getBounds());
		btnClose.setLocation(btnOK.getWidth() + btnOK.getX() + 60, btnOK.getY());
		
		// add를 먼저 할수록 화면상에서 위쪽 레이어에 보여진다
		f.add(btnOK);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
			
		});
		
		
		
	}
}
