package ex1_super;

public class SuperMain {
	public static void main(String[] args) {
		
		Child ch = new Child();
		Parent p = new Parent(10);
		
		System.out.println( p.getResult() );
		System.out.println( ch.getResult() );
		
	}
}
