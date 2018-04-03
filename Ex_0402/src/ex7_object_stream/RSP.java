package ex7_object_stream;

public class RSP {
	
	RspInfo info = new RspInfo();
		
	public RSP(String usr, String com) {
				
		// ���� 0 ���� 1 �� 2 ?
		
		switch (usr) {
		case "r":
			if (com.equals("p")) {
				lose();
			} else if (com.equals("s")) {
				win();
			} else {
				draw();
			}
			break;
		case "s":
			if (com.equals("r")) {
				lose();
			} else if (com.equals("p")) {
				win();
			} else {
				draw();
			}
			break;
		case "p":
			if (com.equals("s")) {
				lose();
			} else if (com.equals("r")) {
				win();
			} else {
				draw();
			}
			break;

		default:
			System.out.println("��ȿ���� ���� �Է�");
			break;
		} // switch
		
	} // construct
	
	public void win() {
		info.setWin(info.getWin() + 1);
		System.out.println("�¸�");
	}
	
	public void lose() {
		info.setLose(info.getLose() + 1);
		System.out.println("�й�");
	}
	
	public void draw() {
		info.setDraw(info.getDraw() + 1);
		System.out.println("���º�");
	}
	
}
