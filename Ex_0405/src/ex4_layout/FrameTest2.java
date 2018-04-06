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
		
		// 북쪽에 넣을 컴포넌트들을 묶는다
		// Panel은 기본값이 FlowLayout
		Panel p_north = new Panel();
		Panel p_south = new Panel();
		p_north.setBackground(Color.ORANGE);
		p_south.setBackground(Color.ORANGE);
		
		// TextField("하고싶은 말", 입력상자의 길이);
		TextField tf = new TextField(12);
		
		// TextArea("하고싶은 말", 입력상자의 열 수, 입력상자의 행 수, 스크롤 방식);
		TextArea ta = new TextArea(null, 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false); // 텍스트 애리어 에디팅 비활성화
				
		Button b_submit = new Button("확인");
		Button b_save = new Button("저장");
		Button b_load = new Button("불러오기");
		Button b_exit = new Button("닫기");
		
		b_submit.setEnabled(false); // 버튼 비 활성화
		
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
		
		// TextField에 값이 들어간 경우에만 입력버튼 활성화 (한글자 단위 감지)
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
		
		// 엔터키를 누를 경우 텍스트 필드에 있는 값을 텍스트 애리어로 추가
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			}
		});
		
		// 확인 버튼
		b_submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
		
		// 저장 버튼
		b_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String msg = ta.getText();
					FileDialog fd = new FileDialog(f, "저장", FileDialog.SAVE);
					fd.setVisible(true);
					
					String path = fd.getDirectory() + fd.getFile();
					
					if (!msg.equals("")) {
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(msg);
						
						JOptionPane.showMessageDialog(f, path + "\n경로에 저장 성공!");
						
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
		
		// 불러오기 버튼
		b_load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String msg = null;
					FileDialog fd = new FileDialog(f, "불러오기", FileDialog.LOAD);
					fd.setVisible(true);
					
					String path = fd.getDirectory() + fd.getFile();
					
					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);
					
					while ((msg = br.readLine()) != null) {
						ta.append(msg + "\n");
					}
					
					JOptionPane.showMessageDialog(f, "불러오기 성공!");
					
					
					
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
		
		// 닫는 버튼
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
