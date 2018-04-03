package work;

import java.util.Scanner;

public class WordgameMain {
	public static void main(String[] args) {
		
		String[] arr = {"hope", "view", "apple"};
		
		WordScramble ws = new WordScramble(arr);
		
		String answer = ws.getAnswer();
		
		String question = ws.getScrambleword(answer);
		
		System.out.println("���� : " + question);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("����? : ");
			String str = sc.next();
			
			//����ó��
			if( str.equalsIgnoreCase( answer ) ) {
				System.out.println( str + "����!!!" );
				break;
				
			}else {
				System.out.println(str + "����...");
				
			}
			
		}//while
		
	}//main
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
