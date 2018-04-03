package work2;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("첫번째 정수: ");
		calc.setNum(sc.nextInt());
		System.out.print("연산기호: ");
		calc.setOperator(sc.next());
		System.out.print("두번째 정수: ");
		calc.setNum2(sc.nextInt());
		
		calc.setResult(calc.getNum(), calc.getNum2(), calc.getOperator());
		
		System.out.println("결과:\n" + calc.getNum() + " " + calc.getOperator() + " " + calc.getNum2() + " = " + calc.getResult());
	}
}
