package ex2_object;

public class ObjMain {
	public static void main(String[] args) {
		
		ObjTest v1 = new ObjTest();
		v1.setValue("TEST");
		System.out.println( v1.getValue() );
		
		int num = 100;
		
		//AutoBoxing(�ڵ� ����ȯ : �⺻�ڷ��� -> ��ü)
		v1.setValue( num );
		
		
		//UnBoxing( ��ü -> �⺻�ڷ��� )
		int num2 = (int)v1.getValue();
		System.out.println(num2);
		
		
		v1.setValue( 'A' );
		char ch = (char)v1.getValue();
		System.out.println( ch );
		
	}//main
}















