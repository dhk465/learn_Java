package ex5_daemon;

public class DaemonMain {
	public static void main(String[] args) throws InterruptedException {

		// ���� ������� �ٸ� �Ϲ� �������� �۾��� ���� �������� ������ ����
		// �Բ� �������� ���� �����尡 ����Ǹ� ���󾲷��嵵 �Բ� ����
		
		DaemonTest dt = new DaemonTest();
		Thread th = new Thread(dt);
		
		// th �����带 daemon������� �����.
		// th�� ȣ���� ���ξ����尡 ����� �� �Բ� ����
		th.setDaemon(true);
		
		th.start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("���� ��..." + i);
			Thread.sleep(1000);
		}
		
		System.out.println("���� ����");
		
	}
}