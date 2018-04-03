package work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionMain {
	public static void main(String[] args) {
		
		int answer = 0;
		
		Addition ga = new Addition();
		Thread th = new Thread(ga);
		Scanner sc = new Scanner(System.in);
		
		th.start();
		
		while (ga.getCount() < ga.getFINISH()) {
			
			System.out.print("Solve the following addition:\n" + ga.getRandom1() + " + " + ga.getRandom2() + " = ");
			
			try {
				answer = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Input not an integer");
			} // try-catch
			
			if (ga.isCorrect(answer)) {
				ga.resetGame();
			} // reset
			
		} // while
		
		System.out.println(ga.getSecond() + " seconds to clear five questions!");
		
	} // main
}
