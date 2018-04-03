package work;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 입력: ");
		num = sc.nextInt();
	
		Gugudan ggd = new Gugudan();
		
		ggd.showGugu(num);
		
	}
}
