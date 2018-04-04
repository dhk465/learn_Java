package ex7_object_stream;

import java.io.Serializable;

public class RspInfo implements Serializable {
	// implementing Serializable serializes members of the class in the memory for further work (e.g. saving)
	
	private int win = 0;
	private int lose = 0;
	private int draw = 0;
	private String name;

	private boolean isPlaying = true;
	
	private int user = 255;

	public void result(String usr, int com) {
		
		switch (usr) {
		case "r":
			user = 0;
			break;
		case "p":
			user = 1;
			break;
		case "s":
			user = 2;
			break;
		default:
			System.out.println("유효하지 않은 입력");
			user = 255;
			break;
		} // switch
		
			if (user - com == 1 || user - com == -2) {
				setWin(getWin() + 1);
				System.out.println("승리");
			} else if (user - com == -1 || user - com == 2) {
				setLose(getLose() + 1);
				System.out.println("패배");
			} else if (user - com == 0) {
				setDraw(getDraw() + 1);
				System.out.println("무승부");
			} else {
			}
		
	} // construct
	
	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
