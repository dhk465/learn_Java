package ex2_vending;

public class VendingMachine {
	private Can[] cans = new Can[5];
	private int money;
	
	public VendingMachine() {
		//음료 준비
		cans[0] = new Can("Coke", 2000);
		cans[1] = new Can("Fanta", 2000);
		cans[2] = new Can("MountainDew", 2500);
		cans[3] = new Can("IcedCoffee", 1200);
		cans[4] = new Can("IceTea", 1800);
		
	}
	
/*	// 초기화
	public void init() {
		
		for (int i = 0; i < cans.length; i++) {
			cans[i] = new Can();
		}
		
		// 음료수 이름 & 가격 세팅
		cans[0].setCanName("Coke");
		cans[1].setCanName("Fanta");
		cans[2].setCanName("MountainDew");
		cans[3].setCanName("IceCoffee");
		cans[4].setCanName("IceTea"); 
		cans[0].setPrice(2000);
		cans[1].setPrice(2000);
		cans[2].setPrice(2500);
		cans[3].setPrice(1200);
		cans[4].setPrice(1800);
	}
 		생성자를 이용해 객체를 생성하여 init()은 필요없어졌다.	*/

	// 사용자가 투입한 금액의 범위에서 먹을수 있는 음료수의 목록만 출력
	public void showCans(int money) {
		this.money = money;
		for (int i = 0; i < cans.length; i++) {
			if (cans[i].getPrice() <= money) {
				System.out.println(cans[i].getCanName() + " - " + cans[i].getPrice() + "KRW");
			}
		} /*for*/
	} /*showCans()*/
	
	// 사용자가 선택한 음료수를 제공하고 잔액을 반환하는 메서드
	public void outCan(String name) {
		for (int i = 0; i < cans.length; i++) {
			if (cans[i].getCanName().equals(name)) {
				System.out.println("Preparing " + cans[i].getCanName() + "...");
				System.out.println("Changes:" + (money - cans[i].getPrice()));
			}
		}
	} /*outCan()*/ 
	
} 
