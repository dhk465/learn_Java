package ex5_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex3_BufferedReader {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FilePath.PATH + "/test.txt");
			br = new BufferedReader(fr);
			
			String msg = "";
			
			// 한줄 단위로 내용을 읽는다
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (br != null)
				br.close();
				
			if (fr != null)
				fr.close();
			
		}
		
	} // main
}
