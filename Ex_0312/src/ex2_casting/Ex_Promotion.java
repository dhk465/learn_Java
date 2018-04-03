package ex2_casting;

public class Ex_Promotion {
	
	public static void main(String[] args) {
		// 캐스팅 (형변환)
		
		/*
		1. 프로모션 promotion 캐스팅
		
			큰 자료형에 작은 자료형을 대입하는 형태 (자동으로 이루어짐)
			
		2. 디모션 demotion 캐스팅
		
			작은 자료형에 큰 자료형을 대입하는 형태 (수동으로 해야함)
		
		*/
		
		double d = 100.5; // 8 bytes
		int n = 200; // 4 bytes
		
		d = n;
		
		System.out.println("d: " + d);
		System.out.println("-------------------");
		
		char c = 'A'; // 2 bytes
		long l = 100; // 8 bytes
		
		l = c;
		
		System.out.println("l: " + l);
		System.out.println("-------------------");
		
	}
	
}
