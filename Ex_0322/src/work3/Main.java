package work3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		
		int guess;
		
		System.out.print("������ ������ �ִ�ġ�� �����ϼ���: ");
		st.setDifficulty(sc.nextInt());

		while (true) {
			
			System.out.print("����: ");
			guess = sc.nextInt();
			
			st.takeGuess(guess);
			
			if (st.isCorrect()) {
				break;
			}
		}
		
	}
}
