package ex1_operator;

public class Ex3_Operator {

	public static void main(String[] args) {
		
		// ���� ������
		
		int a = 10;
		System.out.println("a: " + ++a);
		
		int b = 10;
		System.out.println("b: " + b++);
		System.out.println("b: " + b);
		
		
		// ����(����) ������
		
		int a1 = 10;
		int b1 = 15;
		
		boolean res = ++a1 >= b1 ? true : false;
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		
		char result = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println(result);
		
		int aa = 10;
		int bb = 12;
		
		res = ++aa >= bb || 2 + 7 <= bb && 13 - bb >= 0 && (aa += bb) - (aa % bb) > 10 ? true : false;
		System.out.println(res);
	}
	
}
