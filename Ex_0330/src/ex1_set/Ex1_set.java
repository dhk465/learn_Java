package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_set {
	public static void main(String[] args) {
		// java.util��Ű���� �����ϴ� �������̽�
		// Ư�� �ڵ忡�� �ߺ��� ���� ����� �־�� �ȵɽ� ���
		// set�� �׿��Ͽ� ������ �ڵ� ���� ���� �ߺ��Ǵ� ��ҵ��� ������ �� �ִٴ� ����
				
		HashSet<Integer> hs = new HashSet<>();
		
		while (true) {
			
			int n = new Random().nextInt(45) + 1;
			System.out.print(n + " ");
			
			hs.add(n);	// HashSet�� n�� �������� ����
						// Set���� ����� �Ȱ��� ���� ������ add() ���� ����
			
			if (hs.size() >= 6) {
				break;
			} // if
			
		} // while
		
		System.out.println();
		System.out.println(hs);
		
		System.out.println("-----------------");
		
		// HashSet�� �� �ڸ� ���� ����
		// HashSet�� �ڽ�Ŭ������ TreeSet�� ���������� �⺻���� ����
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		while (true) {
			
			int n = new Random().nextInt(45) + 1;
			System.out.print(n + " ");
			
			ts.add(n);	// HashSet�� n�� �������� ����
						// Set���� ����� �Ȱ��� ���� ������ add() ���� ����
			
			if (ts.size() >= 6) {
				break;
			} // if
			
		} // while

		System.out.println();
		System.out.println(ts);
		
	} // main
}
