package work2;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("ù��° ����: ");
		calc.setNum(sc.nextInt());
		System.out.print("�����ȣ: ");
		calc.setOperator(sc.next());
		System.out.print("�ι�° ����: ");
		calc.setNum2(sc.nextInt());
		
		calc.setResult(calc.getNum(), calc.getNum2(), calc.getOperator());
		
		System.out.println("���:\n" + calc.getNum() + " " + calc.getOperator() + " " + calc.getNum2() + " = " + calc.getResult());
	}
}
