package ex1_string;

import java.util.Scanner;

public class Ex5_String {
	public static void main(String[] args) {
		// 회문(palindrome)수  판단 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회문을 판별할 숫자나 문자를 입력하세요: ");
		String str = sc.next().trim();
		String palindrome = "";
		
		for (int i = 0; i < str.length(); i++) {
			palindrome += str.charAt(str.length() - (i + 1));			
		}
		
		if (str.equals(palindrome)) {
			System.out.printf("%s는 %s의 회문입니다.\n", palindrome, str);
		} else {
			System.out.printf("%s는 %s의 회문이 아닙니다.\n", palindrome, str);
		}
	}
}
