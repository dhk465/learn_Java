package ex3_choice;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	
	static String str = "";
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 100, 500, 300);
		f.setLayout(null);
		
		
		Button submit = new Button("확인");
		submit.setBounds(300, 150, 60, 50);
		
		Choice region = new Choice();
		region.add("Not specified");
		region.add("Asia/Pacific");
		region.add("North America");
		region.add("Middle East");
		region.add("Europe");
		region.add("Latin America");
		region.add("Subsahran Africa");
		region.add("Mediterranian Region");
		region.add("Oceania");
		
		region.setBounds(100, 100, 200, 0);
		
		region.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				str = (String)e.getItem();
			}
		});
		
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(str + "을(를) 선택하셨습니다.");
			}
		});
		
		f.add(region);
		f.add(submit);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
	}
}
