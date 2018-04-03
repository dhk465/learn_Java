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
		System.out.println("1.	�Ա�");
		System.out.println("2.	���");
		System.out.println("3.	��ȸ");
		System.out.println("4.	����");
	}
	
	public void deposit(int amount) {
		this.money += amount;
		System.out.println(amount + "���� ���������� �Ա��Ͽ����ϴ�.");
	}
	
	public void withdraw(int amount) {
		if (this.money - amount < 0) {
			System.out.println("������ �ܾ��� �����մϴ�.");
		} else {
			this.money -= amount;
			System.out.println(amount + "���� ����Ͽ����ϴ�.");
			System.out.println("������ ���� �ܾ��� " + this.money + "�� �Դϴ�.");
		}
		
	}
	
	public void check() {
		System.out.println("������ ���� �ܾ��� " + this.money + "�� �Դϴ�.");
	}

	public void selectService(int service) {
		int amount;
		
		switch (service) {
		
		case 1:
			System.out.println("���Ͻô� �ݾ��� �Է����ּ��� >> ");
			amount = sc.nextInt();
			deposit(amount);
			break;
			
		case 2:
			if (correctPass()) {
				System.out.println("���Ͻô� �ݾ��� �Է����ּ��� >> ");
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
			System.out.println("��ȿ���� ���� �Է��Դϴ�.");
			break;
		}
	}
	
	public boolean getExit() {
		return this.exit;
	}
	
	public boolean correctPass() {
		
		System.out.print("��й�ȣ�� �Է����ּ���: ");
		int password = sc.nextInt();
		
		if (password == this.password) {
			return true;
		} else {
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			return false;
		}
		
	}
	
}
