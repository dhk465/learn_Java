package ex1_string;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자열 입력: ");
		String str = sc.next().trim();
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		
		System.out.println("a의 갯수: " + count);
	}
}
