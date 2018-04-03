package ex5_interface;

public class InterChild implements InterTest{
	//인터페이스를 구현하려면 implements키워드를 사용한다.
	
	@Override
	public int getValue() {
		return VALUE;
	}

}
