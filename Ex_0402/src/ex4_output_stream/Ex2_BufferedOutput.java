package ex4_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import ex2_io.FilePath;

public class Ex2_BufferedOutput {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(FilePath.PATH + "/bufferedOutput.txt");
			
			
		} catch (Exception e) {
			
		} finally {
			// TODO: handle finally clause
		}
		
		
	}
}
