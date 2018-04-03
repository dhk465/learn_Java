package ex5_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		List<User> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int age = sc.nextInt();
			
			System.out.println("-----------------");
			
			User user = new User(name, age);
			
			list.add(user);
			
			System.out.println("�̸�\t\t����");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName() + "\t\t" + list.get(i).getAge());
			}
			
			System.out.println("------------------");
		}
		
	}
}