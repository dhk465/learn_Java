package ex5_thread;

public class Ex_Thread extends Thread{
	
	//스레드는 독립적인 실행 단위이다.
	//한번에 두가지 이상의 프로세스를 실행 가능하게 해 준다.
	@Override
	public void run() {
		//프로세스의 독립적인 수행을 가능하게 하는 영역
		for( int i = 0; i < 10; i++ ) {
			
			System.out.println( "스레드 실행" );
			
		}//for	
	}
	
}
