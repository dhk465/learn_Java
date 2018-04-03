package ex_method;

public class ValueTest {
	
	public void test(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/(float)b);
	}
	
	public int factorial(int max, int init) {
		int fact = 0;
		
		for (int i = init; i < max + 1; i++) {
			fact += i;
		}
		
		return fact;
	}

	public int factorial(int max) {
		return factorial(max, 1);
	}

}
