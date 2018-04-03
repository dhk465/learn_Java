package ex1_array;

public class Ex3_Array {
	public static void main(String[] args) {
		
		int[] arr = new int[2];
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 100;
			sum += arr[i];
		}
		
		System.out.println("°á°ú: " + sum);
		
	}
}
