package ex3_runnable;

public class RunnableMain {
	public static void main(String[] args) {
		
		RunnableTest rt = new RunnableTest();
		Thread th = new Thread(rt);	// Runnable로는 start()를 사용할 수 없어 Thread와 묶어준다
		
		th.start();
		
	}
}
