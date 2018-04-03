package ex2_multi_array;

import java.util.Scanner;

public class Ex7_MultiArray {
	public static void main(String[] args) {
		int[][] arr;
		int num = 1;
		int size;
		int y = 0;
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("마방진 사이즈(홀수): ");
			size = sc.nextInt();
			if (size % 2 != 0) {
				break;
			}
			System.out.println("홀수만 입력가능합니다.");
		}
		
		x = size / 2;
		arr = new int[size][size]; // 배열을 사용자가 지정한 사이즈로 생성
		
		while (num <= size * size) {
			
			arr[y][x] = num;
			
			if (num % size == 0) {
				y++;
			} else {
				y--;
				x++;
			}
			
			if (y < 0) {
				y = size - 1;
			}
			
			if (x == size) {
				x = 0;
			}
			
			num++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
			
	}
}
