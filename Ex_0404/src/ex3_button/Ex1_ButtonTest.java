package ex3_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonTest {
	public static void main(String[] args) {
		
		Frame f = new Frame("Button Test");
		
		f.setBounds(300, 200, 400, 400);
		
		// �������� �ڵ� ��ġ�� ����.
		f.setLayout(null);
		
		// �ڵ� ��ġ�� �� �������� frame�� �߰��Ǵ� ������Ʈ��
		// ������ ������� ��ġ������ ������ �־�� �Ѵ�
		Button btnOK = new Button("Confirm");
		
		btnOK.setBounds(70, 90,	100, 50);
		
		Button btnClose = new Button("Close");
		
		btnClose.setBounds(btnOK.getBounds());
		btnClose.setLocation(btnOK.getWidth() + btnOK.getX() + 60, btnOK.getY());
		
		// add�� ���� �Ҽ��� ȭ��󿡼� ���� ���̾ ��������
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
