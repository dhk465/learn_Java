package ex3_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex2_io.FilePath;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		// �ѱ��� �о����
		
		String path = FilePath.PATH + "/test.txt";
		File f = new File(path);
		
		byte[] b = new byte[(int) f.length()]; // ���� ũ�⿡ ���� byte�迭 ����Ȯ��
		
		if (f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				fis.read(b);
				
				// b[]�� ����Ǿ��ִ� ������ StringŸ������ ����
				String result = new String(b);
				
				System.out.println(result);
				
				if (fis != null) {
					fis.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}