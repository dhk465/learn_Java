package ex2_generic;

public class GenMain {
	public static void main(String[] args) {
		
		Ex1_Gen<String> v1 = new Ex1_Gen<String>();
		v1.setValue( "æ»≥Á«œººø‰" );
		String str = v1.getValue();
		System.out.println( "v1 : " + str );
		
		Ex1_Gen<Integer> v2 = new Ex1_Gen<>();
		v2.setValue( 100 );
		int num = v2.getValue();
		System.out.println( "v2 : " + num );
		
		Ex1_Gen<Character> v3 = new Ex1_Gen<>();
		v3.setValue( 'A' );
		System.out.println( v3.getValue() );
		
		Ex1_Gen<Boolean> v4 = new Ex1_Gen<>();
		v4.setValue( true );
		System.out.println( v4.getValue() );
		
	}//main
}
























































