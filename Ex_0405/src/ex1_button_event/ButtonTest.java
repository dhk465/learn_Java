package ex1_button_event;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setBounds(500, 100, 1000, 500);
		f.setLayout(new FlowLayout());
		
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		Button b4 = new Button("����");
		
		// flowLayout���� ������ ���� ���
		b1.setPreferredSize(new Dimension(200, 100));
		b2.setPreferredSize(new Dimension(200, 100));
		b3.setPreferredSize(new Dimension(200, 100));
		b4.setPreferredSize(new Dimension(200, 100));
		
		/*b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("click");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("klikk");
			}
		}); // �ѱ����� ���Ƽ� �߻��������̽��� �̿��Ͽ� �̺�Ʈ ó���� ������  */
		
		// ��ư 1-4�� �̺�Ʈ ������ ���
		b1.addActionListener( click );
		b2.addActionListener( click );
		b3.addActionListener( click );
		b4.addActionListener( click );
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
				
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	
	} // main
	
	// interface��üȭ
	
	static ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		//	System.out.println(e.getActionCommand());	// Ŭ���� ��ư�� �����Ǿ��ִ� �ؽ�Ʈ�� �����´�
			
			switch (e.getActionCommand()) {
			case "b1":
				System.out.println("��ư1");
				break;
			case "b2":
				System.out.println("��ư2");
				break;
			case "b3":
				System.out.println("��ư3");
				break;
			case "����":
				System.out.println("����");
				System.exit(0);
				break;
			default:
				break;
			}
			
		}
	};
	
}
