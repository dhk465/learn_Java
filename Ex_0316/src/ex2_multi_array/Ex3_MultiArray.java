package ex2_multi_array;

public class Ex3_MultiArray {
	public static void main(String[] args) {
		
		String[][] java = {{"¿µÈñ", "100", "90"}, {"Ã¶¼ö", "65", "70", "85"}, {"¼øÀÌ", "50"}};
		
		for (int i = 0; i < java.length; i++) {
			for (int j = 0; j < java[i].length; j++) {
				System.out.print(java[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
