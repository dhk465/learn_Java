package ex2_casting;

public class Ex_Demotion {
	
	public static void main(String[] args) {
		
		char c = 'B'; // 2 bytes
		int n = c + 2; // 4 bytes
		
		c = (char)n;
		
		System.out.println("c: " + c);
		
		System.out.println("-------------------");
		
		float f = 3.14f;
		int n2 = 0;
		
		n2 = (int)f;

		System.out.println("n2: " + n2);
		
	}

}
