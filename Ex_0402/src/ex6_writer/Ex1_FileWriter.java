package ex6_writer;

import java.io.FileWriter;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex1_FileWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(FilePath.PATH + "/fileWriter.txt");
			
			String str = "���� fileWriter�� ���� �Դϴ�.";
			
			fw.write(str);
			fw.write("\r\n");
			fw.write("�ι�° ����");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
		
	}
}
