package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/ 참조
		String str = "Hong Gil Dong";
		int index = str.length();
		System.out.println("str의 길이: " + index);
		
		index = str.indexOf('g');
		System.out.println("맨 처음 문자 g의 위치: " + index);
		
		index = str.indexOf("Gil");
		System.out.println("맨 처음 문장 Gil의 위치: " + index);
		
		index = str.lastIndexOf('g');
		System.out.println("맨 마지막 문자 g의 위치 " + index);
		
		char ch = str.charAt(5);
		System.out.println("5번째 위치의 문자: " + ch); // 0번 부터 시작
		
		String str2 = " 홍 길 동 ";
		String trim_str = str2.trim();
		System.out.println(trim_str.length()); // 맨앞과 맨뒤의 의미 없는 공백 제거, 문자 사이의 공백 제거 불가
		
		str2 = str.substring(0, 6);
		System.out.println("0부터 5번째까지 문장: " + str2);
		
		String apple1 = "apple";
		String apple2 = "Apple";
		
		if (apple1.equalsIgnoreCase(apple2)) {
			System.out.printf("%s과 %s의 (대소문자를 무시한) 값이 같다.\n", apple1, apple2);
		} else {
			System.out.printf("%s과 %s의 (대소문자를 무시한) 값이 다르다.\n", apple1, apple2);
		}
		
		String[] arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		str = "Hong:Gil:Dong";
		arr = str.split(":");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		// 문자열 숫자 -> 정수 변환
		
		String number = "70";
		int n = Integer.parseInt(number);
	//	System.out.printf("number (string) + 30 = %d\n", number + 30); // Exception
		System.out.printf("n (parseInt(number)) + 30 = %d\n", n + 30);
	}
}
