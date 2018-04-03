package work3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		
		int guess;
		
		System.out.print("추측할 정수의 최대치를 설정하세요: ");
		st.setDifficulty(sc.nextInt());

		while (true) {
			
			System.out.print("추측: ");
			guess = sc.nextInt();
			
			st.takeGuess(guess);
			
			if (st.isCorrect()) {
				break;
			}
		}
		
	}
}
