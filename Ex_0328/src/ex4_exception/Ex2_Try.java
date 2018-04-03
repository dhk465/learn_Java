package ex4_exception;

public class Ex2_Try {
	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30 };
		
		for( int i = 0; i < arr.length; i++ ) {
			
			try {
			
				System.out.println( "arr[" + i + "] : " + arr[i] );
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}//for
		
	}
}
