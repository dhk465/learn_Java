package ex2_method;

import java.util.Scanner;

public class RegiMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Registry reg = new Registry();
		
		System.out.println("ID: ");
		String id = sc.next();
		System.out.println(reg.isRegistered(id));
		
	}
}
