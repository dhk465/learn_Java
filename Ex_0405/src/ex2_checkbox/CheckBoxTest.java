package ex2_checkbox;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {
	public static void main(String[] args) {
		
		// 사용 가능한 폰트 리스트 출력
		String fonts[]
		        = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (int i = 0; i < fonts.length; i++) {
		    System.out.println(fonts[i]);
		}
		
		// --------------------------------------------------------------
		
		Frame f = new Frame();
		f.setBounds(500, 100, 800, 250);
		f.setLayout(new FlowLayout());
		
		Font font = new Font("휴먼예체", Font.BOLD, 24);
		
		Label question = new Label("1. 관심분야");
		question.setFont(new Font("휴먼편지체", Font.BOLD, 24));
		
		Checkbox news = new Checkbox("뉴스");
		Checkbox sports = new Checkbox("스포츠");
		Checkbox movie = new Checkbox("영화");
		Checkbox music = new Checkbox("음악");
		
		// 체크 박스 선택 여부 판단
		
		news.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("news의 선택 상태: " + e.getStateChange());
				String str = e.getStateChange() == 1 ? "뉴스 선택" : "뉴스 선택 해제";
				System.out.println(str);
			}
		});
		
		f.add(question);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);
		
		// 라디오버튼 생성
		Label question2 = new Label("2. 한 달 영화관람 횟수");
		question2.setFont(font);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox r1 = new Checkbox("한 번", group, true);
		Checkbox r2 = new Checkbox("두 번", group, false);
		Checkbox r3 = new Checkbox("세 번", group, false);
		
		r1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("한달에 한 번 봄");
			}
		});
		
		r2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("한달에 두 번 봄");
			}
		});
		
		r3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("한달에 세 번 봄");
			}
		});
		
		f.add(question2);
		f.add(r1);
		f.add(r2);
		f.add(r3);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
				
	}
}
