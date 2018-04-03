package ex3_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex2_io.FilePath;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		// 한글을 읽어오자
		
		String path = FilePath.PATH + "/test.txt";
		File f = new File(path);
		
		byte[] b = new byte[(int) f.length()]; // 파일 크기에 따라서 byte배열 공간확보
		
		if (f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				fis.read(b);
				
				// b[]에 저장되어있는 값들을 String타입으로 조합
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
