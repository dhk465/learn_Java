package ex2_control_statement;

import java.util.Scanner;

public class Ex5_Switch {

	public static void main(String[] args) {
		
		// month 변수에 월을 입력받고
		// 입력받은 월이 몇 일 까지 존재 하는지 출력
		
		int year = 0;
		int month = 0;
		int days = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도(정수)를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("월(정수)을 입력하세요: ");
		month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 8:
		case 7:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			System.out.println("1에서 12의 정수 중에 선택하세요.");
			break;
		}
		
		System.out.println(month + "월의 날짜수는 " + days + "입니다.");
		
	}
	
}
