package work4;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		
		Graph gr = new Graph();
		
		String numbers = "";
		
		for (int i = 0; i < 100; i++) {
			numbers += new Random().nextInt(10);
		}
		
		int[] arr = new int[10];
		
		for (int i = 0; i < numbers.length(); i++) {
			String s = "" + numbers.charAt(i);	// ascii값을 문자열로 못받지만, '"" +' 를 이용하면 가능하다.
			int n = Integer.parseInt(s);		// 문자열로 바뀐 ascii값을 int 값으로 바꾸어 준다.
			arr[n]++;
		}
		
		gr.drawGraph(arr, '#');
		
	}
}
