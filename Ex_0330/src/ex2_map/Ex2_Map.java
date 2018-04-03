package ex2_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_Map {
	public static void main(String[] args) {
		
		HashMap<String, Integer> user = new HashMap<>();
		user.put("kim", 1111);
		user.put("lee", 2222);
		user.put("park", 3333);
		
		String id;
		int pwd;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID:\t\t");
		id = sc.next();
		System.out.print("Password: \t");
		pwd = sc.nextInt();
		
		if (user.containsKey(id)) {
			
			if (pwd == user.get(id)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 맞지 않습니다.");
			}
			
		} else {
			
			System.out.println(id + "(이)가 존재하지 않습니다.");
			
		}
		
	}
}
