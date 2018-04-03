package ex2_multi_array;

public class Ex2_MultiArray {
	public static void main(String[] args) {
		
		String[][] java = new String[2][2];
		
		java[0][0] = "¿µÈñ";				
		java[0][1] = "100";
		java[1][0] = "Ã¶¼ö";
		java[1][1] = "35";
		
		for (int i = 0; i < java.length; i++) {
			for (int j = 0; j < java[i].length; j++) {
				System.out.print(java[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
