package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_set {
	public static void main(String[] args) {
		// java.util패키지에 존재하는 인터페이스
		// 특정 코드에서 중복된 값의 허용이 있어서는 안될시 사용
		// set을 잉요하여 복잡한 코드 구성 없이 중복되는 요소들을 제거할 수 있다는 장점
				
		HashSet<Integer> hs = new HashSet<>();
		
		while (true) {
			
			int n = new Random().nextInt(45) + 1;
			System.out.print(n + " ");
			
			hs.add(n);	// HashSet에 n의 정수값을 저장
						// Set안의 값들과 똑같은 값이 나오면 add() 동작 안함
			
			if (hs.size() >= 6) {
				break;
			} // if
			
		} // while
		
		System.out.println();
		System.out.println(hs);
		
		System.out.println("-----------------");
		
		// HashSet은 한 자리 수만 정렬
		// HashSet의 자식클래스인 TreeSet은 오름차순이 기본으로 내장
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		while (true) {
			
			int n = new Random().nextInt(45) + 1;
			System.out.print(n + " ");
			
			ts.add(n);	// HashSet에 n의 정수값을 저장
						// Set안의 값들과 똑같은 값이 나오면 add() 동작 안함
			
			if (ts.size() >= 6) {
				break;
			} // if
			
		} // while

		System.out.println();
		System.out.println(ts);
		
	} // main
}
