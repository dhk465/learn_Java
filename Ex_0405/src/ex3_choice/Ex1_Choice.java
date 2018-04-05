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
		day.add("��");
		day.add("ȭ");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
		day.add("��");
		
		// �������� �ڵ���ġ�� ���� ���±� ������
		// ������Ʈ�� ������/��ġ�� ��������� �Ѵ�.
		
		day.setSize(150, 0); // ���̴� choice�� ����� ������� �����ǹǷ� 0�̾ ���x
		day.setLocation(50, 100);
		
		// choice���� ������
		day.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(day.getSelectedItem());	// ���̽��� ���õ� �������� ���̽� ��ü�� ���� ������ ���� �ְ�
				System.out.println(e.getItem());			// �̺�Ʈ �Ķ���͸� ���� ������ ���� �ִ�.
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
