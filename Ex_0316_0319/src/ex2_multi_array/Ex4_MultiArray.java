package ex2_multi_array;

public class Ex4_MultiArray {
	public static void main(String[] args) {
		
		int[][] num = new int[2][];
		
		num[0] = new int[2];
		num[1] = new int[3];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[1][0] = 30;
		num[1][1] = 40;
		num[1][2] = 50;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
