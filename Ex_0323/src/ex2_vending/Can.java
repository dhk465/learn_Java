package ex2_vending;

public class Can {
	private String canName;
	private int price;
	
	public Can(String name, int price) {
		canName = name;
		this.price = price;		
	}
	
	public String getCanName() {
		return canName;
	}
	
	public void setCanName(String canName) {
		this.canName = canName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	
}
