package ex6_thread;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("1");
		}
	}
	
}