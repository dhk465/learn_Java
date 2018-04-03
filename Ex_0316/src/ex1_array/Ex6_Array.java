package ex1_array;

import java.util.Random;

public class Ex6_Array {
	public static void main(String[] args) {
		
		// lottery: a series of random integers between 1 and 45 (no repeated integer in the array)
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
					lotto[j] = new Random().nextInt(45) + 1;
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.print
			(lotto[i] + " ");
		}
		
		
	}
}
