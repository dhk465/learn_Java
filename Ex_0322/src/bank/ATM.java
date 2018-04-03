package bank;

import java.util.Scanner;

public class ATM {
	
	Scanner sc = new Scanner(System.in);
	int password = 1234;
	
	String[][] account;
	
	private int money = 0;
	private boolean exit = false;
	
	public void menu() {
		System.out.println("	ATM");
		System.out.println("1.	입금");
		System.out.println("2.	출금");
		System.out.println("3.	조회");
		System.out.println("4.	종료");
	}
	
	public void deposit(int amount) {
		this.money += amount;
		System.out.println(amount + "원을 성공적으로 입금하였습니다.");
	}
	
	public void withdraw(int amount) {
		if (this.money - amount < 0) {
			System.out.println("계좌의 잔액이 부족합니다.");
		} else {
			this.money -= amount;
			System.out.println(amount + "원을 출금하였습니다.");
			System.out.println("고객님의 계좌 잔액은 " + this.money + "원 입니다.");
		}
		
	}
	
	public void check() {
		System.out.println("고객님의 계좌 잔액은 " + this.money + "원 입니다.");
	}

	public void selectService(int service) {
		int amount;
		
		switch (service) {
		
		case 1:
			System.out.println("원하시는 금액을 입력해주세요 >> ");
			amount = sc.nextInt();
			deposit(amount);
			break;
			
		case 2:
			if (correctPass()) {
				System.out.println("원하시는 금액을 입력해주세요 >> ");
				amount = sc.nextInt();
				withdraw(amount);
			}
			break;
			
		case 3:
			if (correctPass()) {
				check();
			}
			break;
			
		case 4:
			this.exit = true;
			break;
			
		default:
			System.out.println("유효하지 않은 입력입니다.");
			break;
		}
	}
	
	public boolean getExit() {
		return this.exit;
	}
	
	public boolean correctPass() {
		
		System.out.print("비밀번호를 입력해주세요: ");
		int password = sc.nextInt();
		
		if (password == this.password) {
			return true;
		} else {
			System.out.println("비밀번호가 틀립니다.");
			return false;
		}
		
	}
	
}
