package ex3_abstract;

public class AbsChild extends AbsTest{

	int age = 10;
	
	//추상 클래스를 상속받은 자식은 
	//부모인 추상클래스가 가지고 있는 추상메서드를 무조건 받아둬야 한다.
	//사용을 하지 않는다고 하더라도 Overriding은 해 둬야 한다는 의미.
	@Override
	public void setValue(int n) {
		age += n;
	}

	@Override
	public int getValue() {
		return age;
	}

}
































