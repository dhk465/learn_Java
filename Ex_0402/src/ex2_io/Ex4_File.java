package ex2_io;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		String path = FilePath.PATH + "/IO_Test";
		
		File f = new File(path);
		
		// FileŬ���� ����� ���� ����
		if (!f.exists()) {
			// ��ΰ� �������� �ʴ´ٸ� ���� ����
			f.mkdirs();
			System.out.println(path + " ��η� ������ ������");
		} else {
			System.out.println("�̹� ������ �����մϴ�.");
		}
	}
}