package ex1_string;

import java.util.Scanner;

public class Ex5_String {
	public static void main(String[] args) {
		// ȸ��(palindrome)��  �Ǵ� 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ���� �Ǻ��� ���ڳ� ���ڸ� �Է��ϼ���: ");
		String str = sc.next().trim();
		String palindrome = "";
		
		for (int i = 0; i < str.length(); i++) {
			palindrome += str.charAt(str.length() - (i + 1));			
		}
		
		if (str.equals(palindrome)) {
			System.out.printf("%s�� %s�� ȸ���Դϴ�.\n", palindrome, str);
		} else {
			System.out.printf("%s�� %s�� ȸ���� �ƴմϴ�.\n", palindrome, str);
		}
	}
}
