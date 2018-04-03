package ex3_label;

public class Ex1_label_break {
	public static void main(String[] args) {

		outer:for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				
				if(j % 2 == 0) {
					break outer;
				}
				System.out.println(j + " ");
			
			}
			System.out.println();
		
		}
		
	}
}
