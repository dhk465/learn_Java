package ex1_value_type;

public class Ex1_ValueType {

	// 자동완성 "main" + ctrl + space
	public static void main(String args[]) {
		
		// 기본 자료형
		/*
		
		논리형:	boolean		1 bit
		
		문자형:	char		2 bytes
		
		정수형:	byte		1 byte ((-128) ~ 127)
				short		2 bytes ((-32768) ~ 32767)
				int			4 bytes ((-21)억 ~ 21억)
				long		8 bytes ((-900)경 ~ 900경)
		
		실수형: 	float		4 bytes
		 		double		8 bytes
		
		*/
		
		// 변수: 값을 저장하기 위한 공간
		/*
		
		[변수 선언 규칙]
		
			선언:		 	자료형 변수명;
		
			대입:			변수명 = 값;
		
			선언과 대입:	자료형 변수명 = 값;
		
		** 같은 영역에서 중복된 변수명을 사용할 수 없다.
		** 변수명에 숫자가 먼저 들어갈 수 없다.
		** _를 제외하고 특수문자를 사용하지 않는다.
		** 변수명을 (형식상) 한글이나 아랍어등의 문자로 이름짓지 않는다.
		
		[변수 표기법]
		
			카멜 표기법: 각 단어의 첫문자를 대문자로 표기하고 붙여쓰되, 맨 처음 문자는 소문자로 표기
						띄어쓰기 대신 대문자로 단어를 구분
			e.g.	textColor, typeName
			
			파스칼 표기법: 첫 단어를 대문자로 시작하는 표기법 (변수x, 클래스나 인터페이스등에 사용하는 형태)
			e.g.	TextColor, TypeName
			
			헝가리안 표기법: 변수 선언시 접두어를 붙여서 의미파악을 손쉽게 하도록 하는 표기법
			e.g. 	boolean bTest;
					short sTest;
					float fTest;
					int nTest;
			
			스네이크 표기법: 여러단어로 이루어진 경우, 단어사이에 _를 붙여서 구별하는 표기법
			e.g.	text_color, type_name
		
		*/
		
		int number; // 선언
		
		number = 100; // 대입
		
		int number2 = 101;
		
		System.out.println(number + number2);
		
		System.out.println("--------------------------");
		
		
		// 논리형: true/false 두 값만 저장 할 수 있다.
		
		boolean bTest;
		bTest = false;
		
		System.out.println("변수 bTest의 값: " + bTest);

		System.out.println("--------------------------");
		
		
		// 문자형: 홑따옴표 안에 한 글자만 저장할 수 있는 자료형
		
		char ch = 'A';
		System.out.println("변수 ch의 값: " + ch);
		
		char ch2 = 65 + 1;
		System.out.println("변수 ch2의 값: " + ch2);

		System.out.println("--------------------------");
		
		
		// 정수형
		
		byte b = 127;
		short s = -32768;
		int num = 2100000000;
		long lNum = 2200000000l;
		
		
		// 실수형
		
		float fNum = 3.14f;
		double dNum = 3.14;
		float fNum2 = 100;
		double dNum2 = 100;
		
		System.out.println(fNum2);
		
	}
		
}
