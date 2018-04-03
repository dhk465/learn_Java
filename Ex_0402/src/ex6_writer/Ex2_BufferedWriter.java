package ex6_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex2_BufferedWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter(FilePath.PATH + "/bufferedWriter.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("���� BufferedWriter�� �����Դϴ�.");
			bw.newLine();
			bw.write("�ι�° ����");
			
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (bw != null) {
				bw.close();
			}
			if (fw != null) {
				fw.close();
			}
			
		}
		
	}
}
