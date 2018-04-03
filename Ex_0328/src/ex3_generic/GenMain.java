package ex3_generic;

public class GenMain {
	public static void main(String[] args) {
		
		Gen gen1 = new Gen();
		
		Integer[] i = {1, 2, 3, 4, 5};
		Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] c = {'A', 'B', 'C', 'D', 'E'};
		
		gen1.printArr( i );
		gen1.printArr( d );
		gen1.printArr( c );
		
	}//main
}
