package ex1_array;

import java.util.Random;

public class Ex7_Array {
	public static void main(String[] args) {
		
		int money = new Random().nextInt(5000 - 10 + 1) + 10;
		if (money % 10 != 0) {
			money -= money % 10;
		}	
	
		System.out.println(money);
		
		int[] coin = {500, 100, 50, 10};
		
		for (int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			
			if (res > 0) {
				System.out.println(coin[i] + "¿ø: " + res);
				
				money %= coin[i];
			}
		}
	}
		
}
