package ex1_thread_sleep;

public class Ex_ThreadSleep extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // 0.5�� ������
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // sleep�� ������ try/catch�� �������Ѵ�.
			System.out.println(i);
		}
		
	}
	
}