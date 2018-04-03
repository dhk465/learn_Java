package ex1_array;

public class Ex4_Array {

	public static void main(String[] args) {
		
		int[] arr2 = {30, 70, 25};
		
		String[] arr3 = {"Mike", "Pike", "Tike"};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("---------------------");
		
		for (String str : arr3) {
			System.out.println(str);
		}
		
	}
	
}
