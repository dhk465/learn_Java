package ex_work;

import java.util.ArrayList;
import java.util.Scanner;

public class TGMain {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		String[] data = {"apple", "banana", "orange"};
		
		TypeGame tg = new TypeGame(arr, data);
		
		tg.start();
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (arr.size() == 0) {
				System.out.println("CLEAR!");
				tg.setPlaying(false); // 쓰레드 정지
			} // if arr size 0
			
			String userInput = sc.next();
			System.out.println(data);
			
			// 사용자가 입력한 단어와 일치하는 값을 arr에서 검색
			for (int i = 0; i < arr.size(); i++) {
				
				if (userInput.equals(arr.get(i))) {
					arr.remove(i);
				} // if userInput same as an arr element
				
			} // for
			
			
		} // while
	}
}
