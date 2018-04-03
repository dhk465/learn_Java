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
				// FileReader의 read()는 byte단위로 String을 쪼개지 않아도 된어
				// 배열을 정해주지 않아도 된다.

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
