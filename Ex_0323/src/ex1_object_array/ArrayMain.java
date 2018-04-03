package ex1_object_array;

import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
		
		ArrayTest[] person = new ArrayTest[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < person.length; i++) {
			person[i] = new ArrayTest();
			System.out.print("이름: ");
			person[i].setName(sc.next());
			System.out.print("나이: ");
			person[i].setAge(sc.nextInt());
		}
		
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].getName());
			System.out.println("(" + person[i].getAge() + ")");
		} 
	}
}
