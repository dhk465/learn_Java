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
		Button b4 = new Button("종료");
		
		// flowLayout에서 사이즈 변경 방법
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
		}); // 한군데에 몰아서 추상인터페이스를 이용하여 이벤트 처리를 해주자  */
		
		// 버튼 1-4에 이벤트 감지자 등록
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
	
	// interface객체화
	
	static ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		//	System.out.println(e.getActionCommand());	// 클릭한 버튼에 부착되어있는 텍스트를 가져온다
			
			switch (e.getActionCommand()) {
			case "b1":
				System.out.println("버튼1");
				break;
			case "b2":
				System.out.println("버튼2");
				break;
			case "b3":
				System.out.println("버튼3");
				break;
			case "종료":
				System.out.println("종료");
				System.exit(0);
				break;
			default:
				break;
			}
			
		}
	};
	
}
