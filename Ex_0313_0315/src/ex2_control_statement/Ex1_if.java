package ex2_control_statement;

public class Ex1_if {

	public static void main(String[] args) {
		
		/* 제어문
			1. 분기문
				i) 	if
				ii)	switch
			2. 반복문
				i)	for
				ii)	while
				iii)do-while
		*/
		
		int n = 51;
		String str = "안녕하세요."; // string: 문자열
		
		if (n == 50) {
			str = "n은 50입니다.";
		}
		
		if (n != 50) {
			str = "n은 50이 아닙니다.";
		}
			
		System.out.println( str );
		
	}
	
}
