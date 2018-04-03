package computer;

public class ComMain {
	public static void main(String[] args) {
		
		MyComputer com = new MyComputer();
		com.getInfo();
		
		MyComputer com2 = new MyComputer();
		com2.getInfo();
		
		MyComputer com3 = new MyComputer();
		com3.setInfo(1000, 16, 3.0f, "black");
		com3.getInfo();
		
	}
}
