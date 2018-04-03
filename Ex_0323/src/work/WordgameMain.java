package work;

import java.util.Scanner;

public class WordgameMain {
	public static void main(String[] args) {
		
		String[] arr = {"hope", "view", "apple"};
		
		WordScramble ws = new WordScramble(arr);
		
		String answer = ws.getAnswer();
		
		String question = ws.getScrambleword(answer);
		
		System.out.println("문제 : " + question);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정답? : ");
			String str = sc.next();
			
			//정답처리
			if( str.equalsIgnoreCase( answer ) ) {
				System.out.println( str + "정답!!!" );
				break;
				
			}else {
				System.out.println(str + "오답...");
				
			}
			
		}//while
		
	}//main
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
