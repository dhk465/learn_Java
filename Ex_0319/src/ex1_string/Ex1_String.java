package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// 객체 생성법이 2가지: 암시적, 명시적
		// 한번 생성된 문자열의 내용은 변하지 않는다. (불변적 특징)
		
		String s1 = "abc"; // 객체: 클래스로부터 만들어진 변수
		String s2 = "abc"; // *암시적 객체생성
		
		if (s1 == s2) { // 객체는 ==를 통해 heap 주소를 비교
			System.out.println("s1과 s2의 주소가 같습니다.");
		} else {
			System.out.println("s1과 s2의 주소가 다릅니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		String s3 = new String("abc"); // new가 붙으면 무조건 *명시적 객체생성
		String s4 = sc.next();
		
		if (s3 == s4) { // 객체는 ==를 통해 heap 주소를 비교
			System.out.println("s3과 s4의 주소가 같습니다.");
		} else {
			System.out.println("s3과 s4의 주소가 다릅니다.");
		}
		
		if (s3.equals(s4)) { // 스트링 클래스의 "값" 비교
			System.out.println("s3과 s4의 값이 같습니다.");
		} else {
			System.out.println("s3과 s4의 값이 다릅니다.");
		}
		
		String s5 = "홍길동"; 
		s5 += "안녕하세요";
		// 메모리 주소 상에서는 "홍길동"은 garbage-collect되고, "홍길동안녕하세요"의 새로운 주소를 s5가 받는다 (불변적 특징)
		System.out.println(s5);
		
	}
}
