package work;

public class Gugudan {
	
	public void showGugu(int dan) {
		System.out.println(dan + "´Ü");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		if (dan > 9) {
			for (int i = 10; i < dan + 1; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
		}
	}
	
}
