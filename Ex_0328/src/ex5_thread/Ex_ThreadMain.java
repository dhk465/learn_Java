package ex5_thread;

public class Ex_ThreadMain {
	public static void main(String[] args) {
		
		Ex_Thread th = new Ex_Thread();
		
		//�������� run()�޼��带 ��׶��忡�� ���۽�Ű�� �޼���
		th.start();
		
		for( int i = 0; i < 10; i++ ) {
			System.out.println("���ν����� ������");
		}
		
		System.out.println("main������ ����");
	}
}
