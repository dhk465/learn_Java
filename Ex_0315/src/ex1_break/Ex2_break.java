package ex1_break;

public class Ex2_break {
	public static void main(String[] args) {
		
		int n = 0;
		
		while (n < 10) {
			System.out.println(n);
			
			n++;
			
			for (int i = 0; i < 10; i++) {
				if (n == 5) {
					System.out.println("break");
					break;
				}				
			}
						
		}
		
	}
}
