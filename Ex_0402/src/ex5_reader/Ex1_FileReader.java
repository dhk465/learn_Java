package ex5_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex1_FileReader {
	public static void main(String[] args) throws IOException {

		FileReader fr = null;

		try {
			fr = new FileReader(FilePath.PATH + "/test.txt");
			int code = -1;

			while ((code = fr.read()) != -1) {
				// FileReader�� read()�� byte������ String�� �ɰ��� �ʾƵ� �Ⱦ�
				// �迭�� �������� �ʾƵ� �ȴ�.

				System.out.print(code + " ");
				System.out.print((char) code);

			} // while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null)
				fr.close();
		} // try-catch-finally

	} // main
}
