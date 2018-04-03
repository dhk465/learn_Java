package ex1_operator;

public class Ex1_Operator {
	
	public static void main(String[] args) {
		
		/*
			연산자
			
			1. 최고연산자: . ()
				
				
			
			2. 증감연산자: ++ --
				
				
			
			3. 산술연산자: + - * / %
				
				사칙연산과 나머지 값을 구하는 연산자로 나뉜다.
			
			4. 쉬프트연산자: >> << >>>
				
				
			
			5. 비교연산자: < > <= >= == !=
				
				
			
			6. 비트연산자: & | ^ ~
				
				
			
			7. 논리연산자: && || !
				
				
			
			8. 삼항(조건)연산자: ? :
				
				
			
			9. 대입연산자: = *= /= %= += -=
				
				
			
		*/
		
		int n1, n2, n3;
		
		n1 = 20;
		n2 = 7;
		
		n3 = n1 + n2;
		System.out.println("n1 + n2 = " + n3);
		
		n3 = n1 / n2;
		System.out.println("n1 / n2 = " + n3);
		
		n3 = n1 % n2;
		System.out.println("n1 % n2 = " + n3);
		
				
		// 비교 연산자
		
		int a1 = 10;
		int a2 = 20;
		
		boolean result = a1 > a2;
		
		System.out.println("a1 > a2 = " + result);
		
		result = a1 == a2;
		
		System.out.println("a1 == a2 = " + result);
		
		result = a1 != a2;
		
		System.out.println("a1 != a2 = " + result);
		
		
		// 논리 연산자
		
		int age = 30;
		int limit = 35;
		
		boolean res = limit - age >= 5 && age > 30;
		System.out.println(res);
		
		res = limit - age >= 5 && age >= 30;
		System.out.println(res);
		
		res = limit - age > 5 && age >= 30;
		System.out.println(res); // &&(and)연산자는 앞쪽 연산이 false면 뒤쪽 연산을 수행하지 않는다.
		
		int i1 = 10;
		int i2 = 20;
		
		res = i1 + 10 > 20 || i2 - 10 == 11;
		System.out.println(res);
		
		res = i1 + 10 == 20 || i2 - 10 == 11;
		System.out.println(res); // ||(or)연산자는 앞쪽 연산이 true면 뒤쪽 연산을 수행하지 않는다.
		
		System.out.println(!res); // !(not)연산자
		
		
		// 대입 연산자
		
		int k1 = 10;
		int k2 = 7;
		
		while (k1 < 50) {
			System.out.println(k1);
			k1 += k2;
		};
		
		k1 -= k2 + 1;
		System.out.println(k1);
		
		k1 /= 4;
		System.out.println(k1);
		
		k1 %= 3;
		System.out.println(k1);
		
		k1 *= 50;
		System.out.println(k1);
		
	}
	
}
