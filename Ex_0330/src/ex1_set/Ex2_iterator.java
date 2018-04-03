package ex1_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex2_iterator {
	public static void main(String[] args) {
		
		int size = 6;
		
		HashSet<Integer> hs = new HashSet<>();
		
		int[] arr = new int[size];
		
		while (true) {
			
			hs.add(new Random().nextInt(45) + 1);
			
			if (hs.size() >= size) {
				break;
			}
			
		} // while
		
		System.out.println(hs);
		
		// Set구조는 index가 없기 때문에 내용을 얻어오기 위해서는
		// iterator라는 반복자를 사용해야한다.
		Iterator<Integer> it = hs.iterator();
		
		// Set안의 내용을 Array로 복사
		for (int i = 0; i < arr.length; i++) {
			arr[i] = it.next();
			System.out.print(arr[i] + " ");
		} // 이제는 배열로 원하는 index로 접근 가능
	}
}
