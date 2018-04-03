package ex4_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex2_BufferedOutput {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(FilePath.PATH + "/bufferedOutput.txt");
			bos = new BufferedOutputStream(fos);
			
			String str = "BufferedOutputStream�� �����Դϴ�.";
			
			String str2 = "�ι�° �����Դϴ�.";
			
			bos.write(str.getBytes());
			bos.write(str2.getBytes());
			
		} catch (Exception e) {
			
		} finally {
			// BufferedStream�� ����Ʈ�� ��Ƴ��� ó���� �Ͽ�
			// �ݴ� �۾��� �Ҷ� flush�� �Ǿ� write�Լ��� ������.

			if (bos != null) {
				bos.close();
			}
			
			if (fos != null) {
				fos.close();
			} // fos.close()�� bos.close()���� ���� ���� bos.write�� ���� ��θ� ã�� ���Ѵ�.
			
		}
		
		
	}
}
