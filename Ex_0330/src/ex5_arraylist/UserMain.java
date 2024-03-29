package ex5_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		List<User> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.println("-----------------");
			
			User user = new User(name, age);
			
			list.add(user);
			
			System.out.println("이름\t\t나이");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName() + "\t\t" + list.get(i).getAge());
			}
			
			System.out.println("------------------");
		}
		
	}
}
