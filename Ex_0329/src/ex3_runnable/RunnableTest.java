package ex3_runnable;

public class RunnableTest implements Runnable { // Thread를 쓰면서 다른 것을 상속 받고 싶을때

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
