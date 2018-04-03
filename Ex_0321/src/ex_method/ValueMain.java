package ex_method;

public class ValueMain {
	public static void main(String[] args) {
		
		ValueTest vt = new ValueTest();
		
		int num = 100;
		
		vt.test(num, 23);
		
		System.out.println(vt.factorial(num));
		System.out.println(vt.factorial(num, 51));
	}
}
