package ex4_overload;

public class Bakery {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		System.out.println("-----------------------");
		
		Bread bread2 = new Bread(3, "农覆户");

		System.out.println("-----------------------");
		
		bread.makeBread();
		
		System.out.println("-----------------------");
		
		bread.makeBread(5);
		
		System.out.println("-----------------------");
		
		bread2.makeBread(3, "农覆户");
		
	}
	
}
