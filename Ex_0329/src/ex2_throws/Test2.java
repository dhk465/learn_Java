package ex2_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {

	public void getRes() throws InputMismatchException { // ��򰡿� �ִ� catch�ȿ��� ó���ϴ°��� �����ϰ� ���ο츦 ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num;

		num = sc.nextInt();
		System.out.println("���: " + num);
			
		System.out.println("������ �Է��ϼ���.");

		
		
	} // getRes()
	
}
