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
		
		// ��� ������ ��Ʈ ����Ʈ ���
		String fonts[]
		        = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (int i = 0; i < fonts.length; i++) {
		    System.out.println(fonts[i]);
		}
		
		// --------------------------------------------------------------
		
		Frame f = new Frame();
		f.setBounds(500, 100, 800, 250);
		f.setLayout(new FlowLayout());
		
		Font font = new Font("�޸տ�ü", Font.BOLD, 24);
		
		Label question = new Label("1. ���ɺо�");
		question.setFont(new Font("�޸�����ü", Font.BOLD, 24));
		
		Checkbox news = new Checkbox("����");
		Checkbox sports = new Checkbox("������");
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox music = new Checkbox("����");
		
		// üũ �ڽ� ���� ���� �Ǵ�
		
		news.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("news�� ���� ����: " + e.getStateChange());
				String str = e.getStateChange() == 1 ? "���� ����" : "���� ���� ����";
				System.out.println(str);
			}
		});
		
		f.add(question);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);
		
		// ������ư ����
		Label question2 = new Label("2. �� �� ��ȭ���� Ƚ��");
		question2.setFont(font);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox r1 = new Checkbox("�� ��", group, true);
		Checkbox r2 = new Checkbox("�� ��", group, false);
		Checkbox r3 = new Checkbox("�� ��", group, false);
		
		r1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("�Ѵ޿� �� �� ��");
			}
		});
		
		r2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("�Ѵ޿� �� �� ��");
			}
		});
		
		r3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("�Ѵ޿� �� �� ��");
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
