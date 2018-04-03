package ex7_anonymous;

import java.util.Random;
import java.util.Scanner;

public class AnonymousMain {
	public static void main(String[] args) {
		//익명클래스
		//이름이 없는 클래스. 한번만 사용하고 버려지는 객체를 활용할 때 쓰이는 클래스
		
		int random = new Random().nextInt( 10 - 1 + 1 ) + 1;
		
		Random r = new Random();
		int rnd = r.nextInt( 5 ) + 1;
	
		String str = new Scanner(System.in).next();
			
	}
}
