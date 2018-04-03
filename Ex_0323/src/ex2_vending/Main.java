package ex2_vending;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();
//		vm.init();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cash input: ");
		vm.showCans(sc.nextInt());
		
		System.out.print("Select a drink: ");
		
		vm.outCan(sc.next());
	}
}
