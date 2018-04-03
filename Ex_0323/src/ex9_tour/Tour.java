package ex9_tour;

import java.util.Scanner;

public class Tour {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int n = sc.nextInt();

		Guide guide = new Guide(n);

		System.out.println("관광객 등록");
		for( int i = 0; i < n; i++ ) {

			System.out.print( "이름 : " );
			guide.guest[i].setName( sc.next() );

			System.out.print( "나이 : " );
			guide.guest[i].setAge( sc.nextInt() );

			System.out.println("-------------------");

		}//for

		outer : while( true ) {

			System.out.println("1.관광객 정보");
			System.out.println("2.목적지 변경");
			System.out.println("etc.종      료");
			System.out.print(">> ");

			int select = sc.nextInt();

			switch( select ) {

			case 1://전체정보
				for( int i = 0; i < n; i++ ) {
					
					System.out.println( "이름 : " + guide.guest[i].getName() );
					System.out.println( "나이 : " + guide.guest[i].getAge() );
					System.out.println( "목적지 : " + guide.guest[i].getPoint() );
					
					System.out.println("--------------------------");
					
				}//for
				break;

			case 2://목적지 변경
				System.out.print("어디로 변경? : ");
				Guide.point = sc.next();
				System.out.println("-----------------------");
				break;

			default:
				System.out.println("종료");
				break outer;

			}//switch


		}//while


	}//main
}





















































