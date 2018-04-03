package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 11; j++) {
				
				if (j % 3 == 0) {
					continue;
				} // if
				System.out.print(j + " ");
				
			} // inner
			System.out.println();
			
		} // outer
	} // main
}
		