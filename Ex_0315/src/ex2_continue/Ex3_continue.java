package ex2_continue;

import java.util.Scanner;

public class Ex3_continue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 게임시작");
			System.out.println("2. 게임정보");
			System.out.println("3. 게임종료");
			System.out.print(" >> ");
			
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("쾅쾅 우장창 와장창");
				break;
			case 2:
				System.out.println("재밌어요.");
				break;
			case 3:
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴선택이 올바르지 않습니다.");
				continue;
			}
		
			System.out.println("여기는 while의 영역");
		
		}
	}
}
