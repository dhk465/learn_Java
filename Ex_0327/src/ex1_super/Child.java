package ex1_super;

public class Child extends Parent{

	public Child() {
		
		//super는 상속관계의 부모클래스
		super( 10 );
		System.out.println("자식클래스 생성자");
		
	}
	
	@Override
	public String getResult() {
		//부모클래스가 가지고 있는 getResult()메서드 호출
		//return super.getResult();
		return "자식";
	}
	
}











