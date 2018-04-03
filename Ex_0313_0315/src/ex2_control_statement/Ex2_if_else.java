package ex2_control_statement;

public class Ex2_if_else {
	public static void main(String[] args) {
	
		int n = 48;
		String str = "";
		
		if (++n >= 50) {
			str = "n은 50이상의 수";
		} else {
			str = "n은 50미만의 수";
		}
		
		System.out.println(str);
		
		
		// 변수 age에 나이를 대입하고, 30세 이상이면
		// "드실만큼 드셨네요."를, 그렇지 않으면 "더 드셔도 됩니다."를 출력
		// 마지막으로 "감사합니다"를 조건에 관계없이 출력
		
		int age = 36;
		str = "";
		
		if (age >= 30) {
			str = "드실만큼 드셨네요.";
		} else {
			str = "더 드셔도 됩니다.";
		}

		System.out.println(str + "\n감사합니다.");
		
		
		// 삼항 연산자 사용
		
		str = age >= 30 ? "드실만큼 드셨네요." : "더 드셔도 됩니다.";
		System.out.println(str + "\n감사합니다.");
		
	}
}
