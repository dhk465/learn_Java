package ex8_bank;

public class BankMain {
	public static void main(String[] args) {
		
		// static 변수나 메서드는 클래스명.static변수명/.static메서드명()으로바로 접근
		// static 변수나 메서드는 메모리상에 무조건 한개만 만들어진다.
		Bank.interest =0.019f;
		
		Bank bk1 = new Bank("신촌", "02-111-2222");
		bk1.getInfo();
		
		Bank bk2 = new Bank("강남", "02-222-3333");
		bk2.getInfo();
		
		Bank bk3 = new Bank("분당", "031-333-4444");
		bk2.getInfo();
	}
}
