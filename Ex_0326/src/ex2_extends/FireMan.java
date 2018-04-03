package ex2_extends;

public class FireMan extends Human{
	
	//메서드의 오버라이딩. "메서드 재 정의"의 의미
	//상속관계의 객체에서 부모의 함수를 자식이 가져와
	//자식 사정에 맞게 내용을 재정의해서 사용할 수 있도록 한것.
	@Override
	public String getItem() {
		return "소방호스";
	}
	
}
