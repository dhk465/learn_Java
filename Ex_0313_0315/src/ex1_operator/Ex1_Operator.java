package ex1_operator;

public class Ex1_Operator {
	
	public static void main(String[] args) {
		
		/*
			������
			
			1. �ְ�����: . ()
				
				
			
			2. ����������: ++ --
				
				
			
			3. ���������: + - * / %
				
				��Ģ����� ������ ���� ���ϴ� �����ڷ� ������.
			
			4. ����Ʈ������: >> << >>>
				
				
			
			5. �񱳿�����: < > <= >= == !=
				
				
			
			6. ��Ʈ������: & | ^ ~
				
				
			
			7. ��������: && || !
				
				
			
			8. ����(����)������: ? :
				
				
			
			9. ���Կ�����: = *= /= %= += -=
				
				
			
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
		
				
		// �� ������
		
		int a1 = 10;
		int a2 = 20;
		
		boolean result = a1 > a2;
		
		System.out.println("a1 > a2 = " + result);
		
		result = a1 == a2;
		
		System.out.println("a1 == a2 = " + result);
		
		result = a1 != a2;
		
		System.out.println("a1 != a2 = " + result);
		
		
		// �� ������
		
		int age = 30;
		int limit = 35;
		
		boolean res = limit - age >= 5 && age > 30;
		System.out.println(res);
		
		res = limit - age >= 5 && age >= 30;
		System.out.println(res);
		
		res = limit - age > 5 && age >= 30;
		System.out.println(res); // &&(and)�����ڴ� ���� ������ false�� ���� ������ �������� �ʴ´�.
		
		int i1 = 10;
		int i2 = 20;
		
		res = i1 + 10 > 20 || i2 - 10 == 11;
		System.out.println(res);
		
		res = i1 + 10 == 20 || i2 - 10 == 11;
		System.out.println(res); // ||(or)�����ڴ� ���� ������ true�� ���� ������ �������� �ʴ´�.
		
		System.out.println(!res); // !(not)������
		
		
		// ���� ������
		
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
