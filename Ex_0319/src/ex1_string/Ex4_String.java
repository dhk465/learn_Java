package ex1_string;

import java.util.Scanner;

public class Ex4_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String email;
		int indexAt;
		
		do {
			System.out.println("이메일을 입력하세요: ");
			email = sc.next();
			indexAt = email.indexOf("@");
			
			if (indexAt < 6 || indexAt > 10) {
				System.out.println("아이디는 6개에서 10개의 문자만을 포함해야합니다.");
			}
		} while (indexAt < 6 || indexAt > 10);
		

//		id = email.substring(0, indexAt);
		
		String[] arr = email.split("@");
		id = arr[0];
		
//		if (arr[0].length() < 6 || arr[0].length() > 10) ...
		
		System.out.printf("%s님 환영합니다.\n", id);
	}
}
