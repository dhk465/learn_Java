package bank;

import java.util.Scanner;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		int select;
		
		while (true) {
			atm.menu();
			System.out.println("���Ͻô� ���񽺸� �����ϼ��� >> ");
			select = sc.nextInt();
			atm.selectService(select);
			
			if (atm.getExit()) {
				System.out.println("�����մϴ�. ATM ���񽺰� ����˴ϴ�.");
				break;
			}
		}	
	}
}
