package ex1_array;

import java.util.Scanner;

public class Ex5_Array {
	public static void main(String[] args) {
		
		System.out.println("����� ���ĺ��� ������ �����ϼ��� >> ");
		
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[sc.nextInt()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (65 + i);
			System.out.print(ch[i]);
		}
		
	}
}
