
package ex3_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = FilePath.PATH + "/test.txt";
		
		File f = new File(path);
		
		if (f.exists()) {
			try {
				
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				// ��Ʈ���� ���̻� �������� ���ٸ� -1�� ��ȯ�ϰ� �Ǿ��ִ�.
				// ��, ������ ������ ��� ������ �о���� ���� �ݺ����� �����ϰ�
				// �� �ݺ��� ��(EOF)�� -1�� ���������� �ݺ��ϸ� �ȴ�.
				while ((code = fis.read()) != -1) {
					if (code != 35) { // #�� ���� �ʴ´ٴ� ����
						System.out.print((char)code + " ");
					}
				} // while
				
				// ...StreamŬ�������� byte���
				// 1����Ʈ���� ���� �� �ִ�
				// �׷��Ƿ� �ѱ��ڴ� 2bytes�� �ѱ��� �������´� 
				
				if (fis != null) { // null�� �ƴϸ� ��������� �ִٴ� ��
					fis.close(); // ��Ʈ���� ����� �ݵ��� �ݾ� ����Ѵ�.
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}