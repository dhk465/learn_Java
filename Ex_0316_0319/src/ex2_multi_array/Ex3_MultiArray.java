package ex2_multi_array;

public class Ex3_MultiArray {
	public static void main(String[] args) {
		
		String[][] java = {{"����", "100", "90"}, {"ö��", "65", "70", "85"}, {"����", "50"}};
		
		for (int i = 0; i < java.length; i++) {
			for (int j = 0; j < java[i].length; j++) {
				System.out.print(java[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
