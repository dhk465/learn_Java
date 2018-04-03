package ex6_note;

public class Note {
	
	private int page;
	private String color;
	private int price;
	
	public Note() {
		page = 30;
		color = "white";
		price = 2000;
	}
	
	public Note(int page, String color, int price) {
		this.page = page;
		this.color = color;
		this.price = price;
	}
	
	public void getInfo() {
		System.out.println("Color: " + color);
		System.out.println("No. Pages: " + page);
		System.out.println("Price: " + price);
	}
}
