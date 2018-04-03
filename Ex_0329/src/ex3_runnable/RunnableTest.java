package ex3_runnable;

public class RunnableTest implements Runnable { // Thread�� ���鼭 �ٸ� ���� ��� �ް� ������

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
