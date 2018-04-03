package ex2_multi_array;

public class Ex5_MultiArray {
	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12, 13, 14}, {15, 16, 17, 18, 19, 20}};
		int sum = 0;
		float avg;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				count++;
				sum += arr[i][j];
			}
		}
		avg = sum / (float)count;
		
		System.out.printf("Че: %d, ЦђБе: %.1f", sum, avg);
	}
}
