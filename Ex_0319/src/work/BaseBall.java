package work;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		
		// BullCowGame의 다른 버전
		
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터가 발생시킬 난수
		int[] com = new int[3];
		
		outer : for( int i = 0; i < com.length; ) {
			
			com[i] = new Random().nextInt(9) + 1;
			
			for( int j = 0; j < i; j++ ) {
				
				if( com[i] == com[j] ) {
					continue outer;
				}
				
			}//inner
			
			i++;
			
		}//outer
				
		//사용자가 입력받을 값
		int[] user = new int[3];
		
		int count = 0;
		
		while( true ) {
			
			count++;
			
			System.out.println("세자리 수를 입력하세요(예:123) : ");
			int number = sc.nextInt();			
			
			//사용자가 입력받은 세자리 수를 백, 십, 일의 자리로 나눠서 user배열에 저장
			user[0] = number / 100; 
			user[1] = number % 100 / 10;
			user[2] = number % 100 % 10;
			
			//정답처리를 위한 변수
			int strike = 0;
			int ball = 0;
			
			//경우의 수
			for( int i = 0; i < user.length; i++ ) {
				
				for( int j = 0; j < user.length; j++ ) {
					
					if( i == j ) {
						if( com[i] == user[j] ) {
							strike++;
						}
						
					}else {
						if( com[i] == user[j] ) {
							ball++;
						}
						
					}
					
				}//inner
			}//outer
		
			
			
			if (strike > 0 || ball > 0) {
				System.out.printf("%d번째 시도\n%d %d %d\nStrike:\t%d\nBall:\t%d\n\n", count, user[0], user[1], user[2], strike, ball);
			} else {
				System.out.printf("%d번째 시도\nOUT!!!\n\n", count);
			}
			
			if (strike == 3) {
				System.out.printf("정답! %d %d %d\n총 시도 횟수: %d회\n", com[0], com[1], com[2], count);
				break;
			}
			
		}
		
	}
}
