package ex7_static;

public class Ex1_static {
	
	int n;
	static String str = "";
	
	public static void main(String[] args) {
	//	n = 1000;	error
		
		str = "Hello";
		// static �޼��忡���� static ������ ���� ����
		// �ڱ� �ڽ��� Ŭ������ ��üȭ���Ѽ� ����
		Ex1_static st = new Ex1_static();
		st.n = 1000;
	}

}
