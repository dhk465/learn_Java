package ex8_bank;

public class BankMain {
	public static void main(String[] args) {
		
		// static ������ �޼���� Ŭ������.static������/.static�޼����()���ιٷ� ����
		// static ������ �޼���� �޸𸮻� ������ �Ѱ��� ���������.
		Bank.interest =0.019f;
		
		Bank bk1 = new Bank("����", "02-111-2222");
		bk1.getInfo();
		
		Bank bk2 = new Bank("����", "02-222-3333");
		bk2.getInfo();
		
		Bank bk3 = new Bank("�д�", "031-333-4444");
		bk2.getInfo();
	}
}
