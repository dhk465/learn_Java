package ex6_synchronized;

public class SyncThread implements Runnable {
	
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 1000�� �� ����ϴ� �޼���
	public void withdraw(int howMuch) {
		
		// ���� �������� �������� �̸��� �����´�
		String name = Thread.currentThread().getName();
		
		if (getMoney() > 0) { // �ܾ��� 0 �̻��϶�
			money -= howMuch;
			System.out.println(name + " - �ܾ�: " + getMoney());
		} else {
			System.out.println(name + " - �ܾ��� �����ϴ�.");
		}
		
	} // withdraw()

	@Override
	public void run() {
		
		synchronized (SyncThread.this) {
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
					withdraw(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // try-catch

			} // for
			
		} // synchronized: ���� �ȿ����� �۾��� �ش� ������ ������ �ɶ����� �ٸ� �����忡���� ������ ���´�.
		
	} // run()
	
}