package ex3_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_ArrayList {
	public static void main(String[] args) {

		List<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
				
		loop: while (true) {
			System.out.print("���̵� ����: ");
			String id = sc.next();
						
			for (int i = 0; i < arr.size(); i++) {
				
				if (id.equalsIgnoreCase(arr.get(i))) {
					System.out.println("���̵� �ߺ�");
					continue loop;
				}

			} // for - add
			
			arr.add(id);
			
			System.out.println(arr);
			
		} // while
		
	} // main
}