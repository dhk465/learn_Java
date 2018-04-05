package ex3_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 100, 500, 250);
		
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("월");
		day.add("화");
		day.add("수");
		day.add("목");
		day.add("금");
		day.add("토");
		day.add("일");
		
		// 프레임의 자동배치를 꺼둔 상태기 때문에
		// 컴포넌트의 사이즈/위치를 지정해줘야 한다.
		
		day.setSize(150, 0); // 높이는 choice내 요소의 사이즈로 결정되므로 0이어도 상관x
		day.setLocation(50, 100);
		
		// choice선택 감지자
		day.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(day.getSelectedItem());	// 초이스는 선택된 아이템을 초이스 객체를 통해 가져올 수도 있고
				System.out.println(e.getItem());			// 이벤트 파라미터를 통해 가져올 수도 있다.
			}
		});;
		
		f.add(day);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
	}
}
