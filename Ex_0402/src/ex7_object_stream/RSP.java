package ex7_object_stream;

public class RSP {
	
	RspInfo info = new RspInfo();
		
	public RSP(String usr, String com) {
				
		// 가위 0 바위 1 보 2 ?
		
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
			System.out.println("유효하지 않은 입력");
			break;
		} // switch
		
	} // construct
	
	public void win() {
		info.setWin(info.getWin() + 1);
		System.out.println("승리");
	}
	
	public void lose() {
		info.setLose(info.getLose() + 1);
		System.out.println("패배");
	}
	
	public void draw() {
		info.setDraw(info.getDraw() + 1);
		System.out.println("무승부");
	}
	
}
