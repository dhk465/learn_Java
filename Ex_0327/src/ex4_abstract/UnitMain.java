package ex4_abstract;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("해병", 100, false);
		t1.encounter();
		System.out.println( t1.getEnergy() );
		
		Zerg z1 = new Zerg("무리군주", 200, true);
		z1.encounter();
		System.out.println( z1.getEnergy() );
		
		Protoss p1 = new Protoss("광전사", 120, false);
		p1.encounter();
		System.out.println( p1.getEnergy() );
		
	}//main
}
