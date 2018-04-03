package ex7_static;

public class Ex1_static {
	
	int n;
	static String str = "";
	
	public static void main(String[] args) {
	//	n = 1000;	error
		
		str = "Hello";
		// static 메서드에서는 static 변수만 참조 가능
		// 자기 자신의 클래스를 객체화시켜서 가능
		Ex1_static st = new Ex1_static();
		st.n = 1000;
	}

}
