package ex1_operator;

public class Ex2_Operator {

	public static void main(String[] args) {
		
		// 비트 연산자
		// bit단위(2진수)의 연산에 사용
		
		int a = 10; // 1010
		int b = 7; 	// 0111
		
		int c = a & b; // 0010: 1 only if both have 1
		System.out.println("논리곱 = " + c); 
		
		c = a | b; // 1111: 0 only if both have 0
		System.out.println("논리합 = " + c);
		
		c = a ^ b; // 1101: 0 if different, 1 if the same
		System.out.println("배타적or(xor) = " + c);
		
		
		// 쉬프트 연산자
		
		c = a >> 2; // 오른쪽으로 2칸 이동
		System.out.println("a >> 2 = " + c);
		
		char ch = 'F';
		int num = ch >> 1;	// char num = (char)(ch >> 1); 하고 num 출력
		System.out.println((char)num);
		
	}
	
}
