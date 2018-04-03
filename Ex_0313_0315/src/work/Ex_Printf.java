package work;

public class Ex_Printf {
	public static void main(String[] args) {
		
		int num = 10;
		for (int i = 0; i < 2; i++) {
			System.out.printf("%d-%d\n", (i+1), num);
		}
		
		String s1 = "È«±æµ¿";
		String s2 = "³ªÀÌ";
		
		System.out.printf("%s %s(%d)\n", s1, s2, num);
	
		float f1 = 10/3f;
		System.out.printf("%.2f\n", f1);
		
		char ch = 'a';
		System.out.printf("<%c>\n", ch);
	}
}
