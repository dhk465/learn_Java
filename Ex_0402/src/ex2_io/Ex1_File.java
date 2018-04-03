package ex2_io;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		// IO (Input, Output)
		// IO�� ����� ��Ʈ���� �ǹ�
		// ��Ʈ���̶�, �����͸� ������ϱ� ���� ���
		// JVM���� ������ �о���δٴ���, �ֿܼ��� Ű���尪�� ������ ���� �۾��� ����
		// JVM���� �ַܼ� ���� ������ Output, �ݴ�� �ܼ��� ���� JV<���� ������ Input
		
		// FileŬ���� �������
		String path = "c:/test/test.txt";
		
		File test = new File(path);
		
		if (test.isFile()) { // ������ ���� Ŭ���� ��ü�� ����(����x)�� ���
			System.out.println("�뷮: " + test.length() + " bytes");
		}
		
	} // main
}