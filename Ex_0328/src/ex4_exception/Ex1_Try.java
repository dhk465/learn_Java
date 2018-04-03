package ex4_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_Try {
	public static void main(String[] args) {
		//Try-Catch( 예외처리 )
		//자바에서 프로그램이 실행되는 도중 예외(에러, 버그)가 발생하면 그 시점에서
		//프로그램이 강제적으로 종료된다.
		//이것은 올바른 판단이지만, 때로는 예측할 수 있는 가벼운 오류가 있거나
		//예외가 발생했음에도 프로그램 종료 없이 이후의 작업을 진행해야 할 때가 있다.
		//예외처리를 통해 프로그램의 비정상적인 종료를 줄이고 프로그램이 계속 진행될 수 
		//있도록 할 수 있다.
		
		//try{
		//	 프로그램 코드
		//}catch( Exception e ){
		//	try영역에서 예외가 발생 한 경우 처리되는 영역
		//}finally{
		//	예외 유무에 관계없이 무조건 처리되는 영역
		//}
		Scanner sc = new Scanner(System.in);

		System.out.print( "10을 몇으로 나누시겠습니까? : " );

		int n = sc.nextInt();

		int result = 0;

		try {
			result = 10 / n;
			System.out.println("오류 안발생");

		}catch( Exception e ) {
			e.printStackTrace();

		}finally {
			
			System.out.println("finally 영역");
			
		}

		System.out.println( result );
		
		
	}//main
}









