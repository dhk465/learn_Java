package ex3_runnable;

public class RunnableMain {
	public static void main(String[] args) {
		
		RunnableTest rt = new RunnableTest();
		Thread th = new Thread(rt);	// Runnable�δ� start()�� ����� �� ���� Thread�� �����ش�
		
		th.start();
		
	}
}
