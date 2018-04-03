package ex2_control_statement;

public class Ex4_Switch {
	
	// if는 연속된 조건을 사용할때 유리
	// switch는 연속되지 않은 조건을 사용할때 좋음
	
	public static void main(String[] args) {

		
		// 정수 타입 - 최신 버전으로 실수 타입 사용 불가
		
		int n = 1;
		
		switch (n) {
		case 1:
			System.out.println("1. 게임하기");
			break;
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 게임종료");
			break;
		default:
			System.out.println("메뉴를 올바르게 선택해주세요.");
			break;
		}
						
		System.out.println("------------------------");
		
		
		// 문자열 타입
		
		String str = "가";
		String res = "";
		
		switch (str) {
		case "수":
			res = "90-100";
			break;
		case "우":
			res = "80-89";
			break;
		case "미":
			res = "70-79";
			break;
		case "양":
			res = "60-69";
			break;
		case "가":
			res = "59점 이하";
			break;
		default:
			System.out.println("성적 입력이 올바르지 않습니다.");
			break;
		}
		
		System.out.println(res);
	
		System.out.println("------------------------");
		
		
		// 문자 타입
		
		char ch = 'F';
		String score = "";
		
		switch (ch) {
		case 'A':
			score = "Supremacy";
			break;
		case 'B':
			score = "Excellent";
			break;
		case 'C':
			score = "Great";
			break;
		case 'D':
			score = "Well done";
			break;
		case 'E':
			score = "Uh oh";
			break;
		case 'F':
			score = "Failed";
			break;
		default:
			System.out.println("Not a valid input");
			break;
		}
		
		System.out.println(score);
		
	}
	
}
