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
		
		// Set������ index�� ���� ������ ������ ������ ���ؼ���
		// iterator��� �ݺ��ڸ� ����ؾ��Ѵ�.
		Iterator<Integer> it = hs.iterator();
		
		// Set���� ������ Array�� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = it.next();
			System.out.print(arr[i] + " ");
		} // ������ �迭�� ���ϴ� index�� ���� ����
	}
}
