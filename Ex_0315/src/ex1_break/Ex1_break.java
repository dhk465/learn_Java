package ex1_break;

public class Ex1_break {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for(int j = 1; j < 11; j++) {
				if (j % 2 == 0) {
					break;
				} // if
				System.out.print(j + " ");
			} // inner
			System.out.println();
		} // outer
	} // main
}
