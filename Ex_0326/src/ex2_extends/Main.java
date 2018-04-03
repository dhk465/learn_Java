package ex2_extends;

public class Main {
	public static void main(String[] args) {
				
		FireMan fm = new FireMan();
		System.out.println( fm.getItem() );
		
		PoliceMan pm = new PoliceMan();
		System.out.println( pm.getItem() );
		
		Doctor d = new Doctor();
		System.out.println( d.getItem() );
		
	}//main
}
