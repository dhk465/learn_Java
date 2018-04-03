package ex3_label;

import java.util.Iterator;

public class Ex2_label_continue {
	public static void main(String[] args) {
		
		outer: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 11; j++) {
				if (j % 2 == 0) {
					continue outer;
				}
				System.out.print(j + " ");
				
			} // inner
			System.out.println(); // continue 때문에 이 코드를 실행을 못한다
			
		} // outer
		
	} // main
}
