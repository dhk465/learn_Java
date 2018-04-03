package ex3_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex2_io.FilePath;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		String path = FilePath.PATH + "/palindrome.txt";
		File f = new File(path);
		
		byte[] b = new byte[(int) f.length()];
		
		String palindrome = "";
		String backward = "";
		
		if (f.exists()) {
			FileInputStream fis;
			try {
				
				fis = new FileInputStream(f);
				
				/* 
				 // 1����Ʈ�� �б�
 				 
				 int code = -1;
				 
				 while ((code = fis.read()) != -1) {
				 	
				 	palindrome += (char)code;
				 	
				 } // while
				 
				 */
				
				// ��� ����Ʈ �Ѳ����� �б�
				
				fis.read(b);
				
				palindrome = new String(b);
				
				if (fis != null) { // ��Ʈ�� �� �ݱ�!
				 	fis.close();
				 }
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		palindrome = palindrome.trim();
		
		for (int i = palindrome.length() - 1; i >= 0 ; i--) {
			backward += palindrome.charAt(i);
		}
		
		if (palindrome.equals(backward)) {
			System.out.println(backward + "(��)�� " + palindrome + "(��)�� ȸ�����Դϴ�.");
		} else {
			System.out.println(backward + "(��)�� " + palindrome + "(��)�� ȸ������ �ƴմϴ�.");
		}
		
	} // main
}
