package work;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		
		// BullCowGame�� �ٸ� ����
		
		Scanner sc = new Scanner(System.in);
		
		//��ǻ�Ͱ� �߻���ų ����
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
				
		//����ڰ� �Է¹��� ��
		int[] user = new int[3];
		
		int count = 0;
		
		while( true ) {
			
			count++;
			
			System.out.println("���ڸ� ���� �Է��ϼ���(��:123) : ");
			int number = sc.nextInt();			
			
			//����ڰ� �Է¹��� ���ڸ� ���� ��, ��, ���� �ڸ��� ������ user�迭�� ����
			user[0] = number / 100; 
			user[1] = number % 100 / 10;
			user[2] = number % 100 % 10;
			
			//����ó���� ���� ����
			int strike = 0;
			int ball = 0;
			
			//����� ��
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
				System.out.printf("%d��° �õ�\n%d %d %d\nStrike:\t%d\nBall:\t%d\n\n", count, user[0], user[1], user[2], strike, ball);
			} else {
				System.out.printf("%d��° �õ�\nOUT!!!\n\n", count);
			}
			
			if (strike == 3) {
				System.out.printf("����! %d %d %d\n�� �õ� Ƚ��: %dȸ\n", com[0], com[1], com[2], count);
				break;
			}
			
		}
		
	}
}
