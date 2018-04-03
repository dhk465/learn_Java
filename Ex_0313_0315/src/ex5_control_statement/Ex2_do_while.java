package ex5_control_statement;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		// 선 처리, 후 비교
		
		int num = 1;
		
		do {
			System.out.println(num--);
		} while(num > -12);
		// starting with the comparison: 0 > -12
		
		System.out.println("-------------------------");
		
		/*	Java, JSP, Spring 시험을 보고 각각 점수는 0-130점이 대입된다.
		 	각 과목을 do-while문으로 검사하되 100점을 넘어가면 100점 이하가 되도록
		 	난수를 재발생 시킨다.
		 
		 	모두 100점 이하가 되면 반복문을 빠져나와 각 과목별 점수를 화면에 출력시킨다. */

		int java;
		int jsp;
		int spring;
		
		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			spring = new Random().nextInt(131);
		} while (java > 100 || jsp > 100 || spring > 100);
		
		System.out.printf("Java: %d점\nJSP: %d점\nSpring: %d점", java, jsp, spring);
		
	}
}
