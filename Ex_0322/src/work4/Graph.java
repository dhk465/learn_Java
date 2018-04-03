package work4;

public class Graph {
	
	public void drawGraph(int[] arr, char c) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print(c);
			}	
			System.out.println(arr[i]);
		}
	}
}
