package ex2_casting;

public class Ex_Promotion {
	
	public static void main(String[] args) {
		// ĳ���� (����ȯ)
		
		/*
		1. ���θ�� promotion ĳ����
		
			ū �ڷ����� ���� �ڷ����� �����ϴ� ���� (�ڵ����� �̷����)
			
		2. ���� demotion ĳ����
		
			���� �ڷ����� ū �ڷ����� �����ϴ� ���� (�������� �ؾ���)
		
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
