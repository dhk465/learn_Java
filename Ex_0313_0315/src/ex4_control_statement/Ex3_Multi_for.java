package ex4_control_statement;

public class Ex3_Multi_for {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {

				System.out.println(j + " ");

			}

			System.out.println();

		}

		System.out.println("-------------------------");

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		int num = 0;
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(++num + "\t");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		char ch = 'A';
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(ch++ + "\t");
			}
			System.out.println();
		}

		System.out.println("-------------------------");
		
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		String str = "*";
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
		
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.printf("%s", " ");
			}
			for (int j = 1; j < 2 * i; j++) {
				System.out.printf("%s", str);
			}
			System.out.println();
		}
		
		//       *
		//     * * *
		//   * * * * *
		// * * * * * * *

	}

}
