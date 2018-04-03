package ex3_abstract;

abstract public class AbsTest {
	//추상메서드가 한 개 이상 정의되어 있는 클래스를 추상 클래스라고 한다.
	//추상 클래스 또한 abstract키워드를 통해 자신이 추상클래스임을 명시해줘야 한다.
	
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//추상메서드는 body가 없다 - abstract키워드로 명시
	//추상 메서드의 구성
	//abstract [접근제한] [반환형] [메서드명]();
	//[접근제한] abstract [반환형] [메서드명]();
	abstract public void setValue( int n );
	
	//추상 메서드는 body가 없기 때문에 이를 "미완성적 개념"이라고 한다.
	//그러므로 이 미완성개념을 자식이 받아서
	//완성시키는것이 하나의 조건이 된다.
	
}
















