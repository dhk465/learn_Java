package ex2_control_statement;

public class Ex1_if {

	public static void main(String[] args) {
		
		/* ���
			1. �б⹮
				i) 	if
				ii)	switch
			2. �ݺ���
				i)	for
				ii)	while
				iii)do-while
		*/
		
		int n = 51;
		String str = "�ȳ��ϼ���."; // string: ���ڿ�
		
		if (n == 50) {
			str = "n�� 50�Դϴ�.";
		}
		
		if (n != 50) {
			str = "n�� 50�� �ƴմϴ�.";
		}
			
		System.out.println( str );
		
	}
	
}
