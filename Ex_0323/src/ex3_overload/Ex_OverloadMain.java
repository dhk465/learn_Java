package ex3_overload;

public class Ex_OverloadMain {
	public static void main(String[] args) {
		Ex_Overloading over = new Ex_Overloading();
		
		over.getResult();
		over.getResult(0);
		over.getResult('a');
		over.getResult("");
		over.getResult("", 0);
		over.getResult(0, "");
		System.out.println();
	}
}
