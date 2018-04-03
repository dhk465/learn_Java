package ex4_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex1_FileOutput {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(FilePath.PATH + "/fileoutput.txt");
			
			String str = "FileOutputStream�� �����Դϴ�.";
			
			//str�� byte�迭�� ��ȯ�Ͽ� fos�� ���� txt���Ϸ� ����
			fos.write(str.getBytes());
		
		} catch (Exception e) {
			
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
		
	}
}