package ex3_override;

public class CalMain {
	public static void main(String[] args) {
		
		Minus m = new Minus();
		int res = m.getResult(100, 50);
		System.out.println( res );
		
		Plus p = new Plus();
		res = p.getResult(100, 50);
		System.out.println( res );
		
	}//main
}
