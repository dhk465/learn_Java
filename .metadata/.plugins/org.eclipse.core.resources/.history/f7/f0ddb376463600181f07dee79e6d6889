package ex2_io;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = FilePath.PATH;
		
		File file01 = new File(path);
		
		if (file01.isDirectory()) {
			// 디렉토리 안에 있는 하위 요소들의 이름을 배열로 넘긴다.
			String[] elements = file01.list();
			
			System.out.println("---하위 목록들---");
			
			for (int i = 0; i < elements.length; i++) {
				System.out.println(elements[i]);
			}
			
		}
		
	}
}
