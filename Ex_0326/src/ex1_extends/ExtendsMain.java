package ex1_extends;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		System.out.println( c1.car );
		
		//Child�� Parent�� ��ӹް� �ֱ� ������ 
		//�θ�� ���� ��ӹ��� money�� ����� �� �ִ�.
		System.out.println( c1.money );
		System.out.println( c1.str );
		
		//Child�� Parent�� ���� ��ӹ޾��� �����Ƿ�
		//Child�� �� Parent��.
		if( c1 instanceof Parent ) {
			System.out.println( "c1�� Parent�� �ڽ��Դϴ�." );
		}
		
		Parent p = new Parent();
		//�θ� ��üȭ �ص� ��Ӱ����� �ڽ��� ������ ����� �� ����.
		System.out.println( p.money );
		
	}//main
}
















