package ex2_generic;

public class Ex1_Gen<V> {
	//제너릭 클래스란
	//일반적인 코드를 작성하고 이 코드를 다양한 타입의 객체에 대하여
	//재 사용할 수 있게 해 주는 기법.
	
	V value;

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
	
}
