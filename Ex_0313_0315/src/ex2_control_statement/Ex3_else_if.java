package ex2_control_statement;

public class Ex3_else_if {

	public static void main(String[] args) {
		
		int num = 75;
		String str= "";
		
		if (num >= 90) {
			str = "수";
		} else if (num >= 80) {
			str = "우";
		} else if (num >= 70) {
			str = "미"; // else-if 문은 참이 나오면 아래 조건들은 모두 무시
		} else if (num >= 60) {
			str = "양";
		} else {
			str = "가";
		}
	
		System.out.println(str);
		
	}
		
}
