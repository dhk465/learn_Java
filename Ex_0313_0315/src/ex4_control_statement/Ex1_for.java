package ex4_control_statement;

public class Ex1_for {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) { // i 는 지역변수
			System.out.println(i);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + "\t");
		}

		System.out.println();

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + "\t");
			}
		}

		System.out.println();

	}

}
