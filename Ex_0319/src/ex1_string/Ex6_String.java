package ex1_string;

import java.util.Scanner;

public class Ex6_String {
	public static void main(String[] args) {
		
		String[][] actor = {{"[송강호]", "박쥐", "괴물", "관상"}, 
							{"[이병헌]","광해", "G.I.Joe", "레드"},
							{"[전지현]", "엽기적인그녀", "내여자친구를소개합니다", "도둑들"}};
	
		// 배우검색: 이름
		// [이름]
		// 영화1
		// 영화2
		// 영화3
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배우 검색: ");
		String actName = sc.next().trim();
		
		for (int i = 0; i < actor.length; i++) {
			if (actor[i][0].equals("[" + actName + "]")) {
				
				for (int j = 0; j < actor[i].length; j++) {
					
					System.out.println(actor[i][j]);
					
				}
				
			} else {
				
				count++;
				
				if (count == actor.length)
				System.out.println("검색과 일치하는 배우가 없습니다.");
				
			}
			
		}
		
	}
}
