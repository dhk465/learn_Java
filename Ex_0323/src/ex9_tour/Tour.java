package ex9_tour;

import java.util.Scanner;

public class Tour {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� : ");
		int n = sc.nextInt();

		Guide guide = new Guide(n);

		System.out.println("������ ���");
		for( int i = 0; i < n; i++ ) {

			System.out.print( "�̸� : " );
			guide.guest[i].setName( sc.next() );

			System.out.print( "���� : " );
			guide.guest[i].setAge( sc.nextInt() );

			System.out.println("-------------------");

		}//for

		outer : while( true ) {

			System.out.println("1.������ ����");
			System.out.println("2.������ ����");
			System.out.println("etc.��      ��");
			System.out.print(">> ");

			int select = sc.nextInt();

			switch( select ) {

			case 1://��ü����
				for( int i = 0; i < n; i++ ) {
					
					System.out.println( "�̸� : " + guide.guest[i].getName() );
					System.out.println( "���� : " + guide.guest[i].getAge() );
					System.out.println( "������ : " + guide.guest[i].getPoint() );
					
					System.out.println("--------------------------");
					
				}//for
				break;

			case 2://������ ����
				System.out.print("���� ����? : ");
				Guide.point = sc.next();
				System.out.println("-----------------------");
				break;

			default:
				System.out.println("����");
				break outer;

			}//switch


		}//while


	}//main
}





















































