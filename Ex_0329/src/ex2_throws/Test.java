package ex2_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public void getRes() throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num;

		num = sc.nextInt();
		System.out.println("���: " + num);

		
	} // getRes()
	
}
