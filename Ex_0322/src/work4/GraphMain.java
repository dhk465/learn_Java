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
			String s = "" + numbers.charAt(i);	// ascii���� ���ڿ��� ��������, '"" +' �� �̿��ϸ� �����ϴ�.
			int n = Integer.parseInt(s);		// ���ڿ��� �ٲ� ascii���� int ������ �ٲپ� �ش�.
			arr[n]++;
		}
		
		gr.drawGraph(arr, '#');
		
	}
}
