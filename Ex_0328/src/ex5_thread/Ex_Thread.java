package ex5_thread;

public class Ex_Thread extends Thread{
	
	//������� �������� ���� �����̴�.
	//�ѹ��� �ΰ��� �̻��� ���μ����� ���� �����ϰ� �� �ش�.
	@Override
	public void run() {
		//���μ����� �������� ������ �����ϰ� �ϴ� ����
		for( int i = 0; i < 10; i++ ) {
			
			System.out.println( "������ ����" );
			
		}//for	
	}
	
}
