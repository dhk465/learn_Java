package ex5_daemon;

public class DaemonMain {
	public static void main(String[] args) throws InterruptedException {

		// 데몬 쓰레드는 다른 일반 쓰레드의 작업을 돕는 보조적인 역할을 수행
		// 함께 구동중인 메인 쓰레드가 종료되면 데몬쓰레드도 함께 종료
		
		DaemonTest dt = new DaemonTest();
		Thread th = new Thread(dt);
		
		// th 쓰레드를 daemon쓰레드로 만든다.
		// th를 호출한 메인쓰레드가 종료될 때 함께 종료
		th.setDaemon(true);
		
		th.start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("게임 중..." + i);
			Thread.sleep(1000);
		}
		
		System.out.println("게임 종료");
		
	}
}
