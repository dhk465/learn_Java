package ex4_exception;

import java.util.Scanner;

public class Ex4_Try {
	public static void main(String[] args) {
		
		//���� : 100
		//��� : 100
		
		//���� : aaa
		//aaa��(��) ������ �ƴմϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
		String str = "";
		
		try {
			
			str = sc.next();
			int n = Integer.parseInt( str );
			System.out.println("��� : " + n);
			
		}catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println(str + "�� ������ �ƴմϴ�.");
			
		}
		
		
	}//main
}


























