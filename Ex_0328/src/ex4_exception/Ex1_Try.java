package ex4_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_Try {
	public static void main(String[] args) {
		//Try-Catch( ����ó�� )
		//�ڹٿ��� ���α׷��� ����Ǵ� ���� ����(����, ����)�� �߻��ϸ� �� ��������
		//���α׷��� ���������� ����ȴ�.
		//�̰��� �ùٸ� �Ǵ�������, ���δ� ������ �� �ִ� ������ ������ �ְų�
		//���ܰ� �߻��������� ���α׷� ���� ���� ������ �۾��� �����ؾ� �� ���� �ִ�.
		//����ó���� ���� ���α׷��� ���������� ���Ḧ ���̰� ���α׷��� ��� ����� �� 
		//�ֵ��� �� �� �ִ�.
		
		//try{
		//	 ���α׷� �ڵ�
		//}catch( Exception e ){
		//	try�������� ���ܰ� �߻� �� ��� ó���Ǵ� ����
		//}finally{
		//	���� ������ ������� ������ ó���Ǵ� ����
		//}
		Scanner sc = new Scanner(System.in);

		System.out.print( "10�� ������ �����ðڽ��ϱ�? : " );

		int n = sc.nextInt();

		int result = 0;

		try {
			result = 10 / n;
			System.out.println("���� �ȹ߻�");

		}catch( Exception e ) {
			e.printStackTrace();

		}finally {
			
			System.out.println("finally ����");
			
		}

		System.out.println( result );
		
		
	}//main
}









