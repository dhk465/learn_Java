package ex1_operator;

public class Ex2_Operator {

	public static void main(String[] args) {
		
		// ��Ʈ ������
		// bit����(2����)�� ���꿡 ���
		
		int a = 10; // 1010
		int b = 7; 	// 0111
		
		int c = a & b; // 0010: 1 only if both have 1
		System.out.println("���� = " + c); 
		
		c = a | b; // 1111: 0 only if both have 0
		System.out.println("���� = " + c);
		
		c = a ^ b; // 1101: 0 if different, 1 if the same
		System.out.println("��Ÿ��or(xor) = " + c);
		
		
		// ����Ʈ ������
		
		c = a >> 2; // ���������� 2ĭ �̵�
		System.out.println("a >> 2 = " + c);
		
		char ch = 'F';
		int num = ch >> 1;	// char num = (char)(ch >> 1); �ϰ� num ���
		System.out.println((char)num);
		
	}
	
}
