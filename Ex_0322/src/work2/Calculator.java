package work2;

public class Calculator {
	
	private int num;
	private int num2;
	private String operator;
	private int result;
	
	public int getNum() {
		return num;
	}

	public int getNum2() {
		return num2;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public int getResult() {
		return result;
	}
	
	
	public void setNum(int num) {
		this.num = num;
	}
		
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public void setResult(int num, int num2, String operator) {
		
		switch (operator) {
		case "+":
			result = num + num2;
			break;
		case "-":
			result = num - num2;
			break;
		case "*":
			result = num * num2;
			break;
		case "/":
			result = num / num2;
			break;
		case "%":
			result = num % num2;
			break;

		default:
			System.out.println("유효하지 않은 연산기호 입니다.");
			break;
		}
		
	}
	
	
	
}
