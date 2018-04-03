package ex1_extends;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		System.out.println( c1.car );
		
		//Child는 Parent를 상속받고 있기 때문에 
		//부모로 부터 상속받은 money를 사용할 수 있다.
		System.out.println( c1.money );
		System.out.println( c1.str );
		
		//Child는 Parent로 부터 상속받아져 있으므로
		//Child는 곧 Parent다.
		if( c1 instanceof Parent ) {
			System.out.println( "c1은 Parent의 자식입니다." );
		}
		
		Parent p = new Parent();
		//부모를 객체화 해도 상속관계의 자식의 변수를 사용할 수 없다.
		System.out.println( p.money );
		
	}//main
}
















