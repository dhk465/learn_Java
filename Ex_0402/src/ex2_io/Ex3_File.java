package ex2_io;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = FilePath.PATH;
		File file = new File(path);
		
		if (file.isDirectory()) {
			
			// ���� ��ҵ��� FileŬ���� �迭�� ������ 
			// for���� �ݺ��ϸ鼭 ���翩��, ���丮 ������
			// FileŬ�������� ������ ��ɵ��� �Բ� ��� ����
			File[] files = file.listFiles();
		
			System.out.println("����:");
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) { // ���� ����� ������ ���
					System.out.println(files[i].getName());
				}
			}
			
			System.out.println();
			System.out.println("����:");
			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile()) { // ���� ����� ������ ���
					System.out.println(files[i].getName());
				}
			}
			
		}
		
		
	}
}