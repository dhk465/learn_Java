package ex6_synchronized;

public class SyncMain {
	public static void main(String[] args) {
		
		SyncThread atm = new SyncThread();
		// mom �� son �����尡 atm �� ����
		Thread mom = new Thread(atm, "����");
		Thread son = new Thread(atm, "�Ƶ�");
		
		mom.start();
		son.start();
		
	}
}