package bank;

import java.util.Scanner;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		int select;
		
		while (true) {
			atm.menu();
			System.out.println("원하시는 서비스를 선택하세요 >> ");
			select = sc.nextInt();
			atm.selectService(select);
			
			if (atm.getExit()) {
				System.out.println("감사합니다. ATM 서비스가 종료됩니다.");
				break;
			}
		}	
	}
}
