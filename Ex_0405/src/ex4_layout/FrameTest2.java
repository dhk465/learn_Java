package ex4_layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FrameTest2 {
	public static void main(String[] args) {
		
		Frame f = new Frame();
	
		f.setBounds(500, 100, 250, 400);
		f.setBackground(Color.BLACK);
		
		Font font = new Font("Times New Roman", Font.PLAIN, 20);
		
		// ���ʿ� ���� ������Ʈ���� ���´�
		// Panel�� �⺻���� FlowLayout
		Panel p_north = new Panel();
		Panel p_south = new Panel();
		p_north.setBackground(Color.ORANGE);
		p_south.setBackground(Color.ORANGE);
		
		// TextField("�ϰ���� ��", �Է»����� ����);
		TextField tf = new TextField(12);
		
		// TextArea("�ϰ���� ��", �Է»����� �� ��, �Է»����� �� ��, ��ũ�� ���);
		TextArea ta = new TextArea(null, 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false); // �ؽ�Ʈ �ָ��� ������ ��Ȱ��ȭ
				
		Button b_submit = new Button("Ȯ��");
		Button b_save = new Button("����");
		Button b_load = new Button("�ҷ�����");
		Button b_exit = new Button("�ݱ�");
		
		b_submit.setEnabled(false); // ��ư �� Ȱ��ȭ
		
		p_north.add(tf);
		p_north.add(b_submit);
		p_north.setFont(font);
		p_south.add(b_save);
		p_south.add(b_load);
		p_south.add(b_exit);
		p_south.setFont(font);
		
		f.setLayout(new BorderLayout());
		f.add(p_north, BorderLayout.NORTH);
		f.add(p_south, BorderLayout.SOUTH);
		f.add(ta, BorderLayout.CENTER);
		
		// TextField�� ���� �� ��쿡�� �Է¹�ư Ȱ��ȭ (�ѱ��� ���� ����)
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent arg0) {
				if (tf.getText() == "") {
					b_submit.setEnabled(false);
				} else {
					b_submit.setEnabled(true);
				}
			}
		});
		
		// ����Ű�� ���� ��� �ؽ�Ʈ �ʵ忡 �ִ� ���� �ؽ�Ʈ �ָ���� �߰�
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			}
		});
		
		// Ȯ�� ��ư
		b_submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
		
		// ���� ��ư
		b_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String msg = ta.getText();
					FileDialog fd = new FileDialog(f, "����", FileDialog.SAVE);
					fd.setVisible(true);
					
					String path = fd.getDirectory() + fd.getFile();
					
					if (!msg.equals("")) {
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(msg);
						
						JOptionPane.showMessageDialog(f, path + "\n��ο� ���� ����!");
						
						bw.flush();
						
						if (bw != null) {
							bw.close();
						}
						if (fw != null) {
							fw.close();
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		// �ҷ����� ��ư
		b_load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String msg = null;
					FileDialog fd = new FileDialog(f, "�ҷ�����", FileDialog.LOAD);
					fd.setVisible(true);
					
					String path = fd.getDirectory() + fd.getFile();
					
					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);
					
					while ((msg = br.readLine()) != null) {
						ta.append(msg + "\n");
					}
					
					JOptionPane.showMessageDialog(f, "�ҷ����� ����!");
					
					
					
					if (br != null) {
						br.close();
					}
					
					if (fr != null) {
						fr.close();
					}
					
					path = null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		// �ݴ� ��ư
		b_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		f.setResizable(false);
		f.setVisible(true);
	}
}
