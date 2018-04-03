package ex5_thread;

public class Ex_ThreadMain {
	public static void main(String[] args) {
		
		Ex_Thread th = new Ex_Thread();
		
		//스레드의 run()메서드를 백그라운드에서 동작시키는 메서드
		th.start();
		
		for( int i = 0; i < 10; i++ ) {
			System.out.println("메인스레드 동작중");
		}
		
		System.out.println("main스레드 종료");
	}
}
