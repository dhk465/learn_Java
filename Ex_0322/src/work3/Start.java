package work3;

import java.util.Random;

public class Start {	
	private int random;
	private boolean correct = false;
	private int count = 1;
	
	public void setDifficulty(int difficulty) {
		this.random = new Random().nextInt(difficulty) + 1;;
	}
	
	public void takeGuess(int guess) {
		if (guess == random) {
			correct = true;
			System.out.println(count + "회만에 정답을 맞추었습니다!");
		} else if (guess < random) {
			System.out.println("UP!!!");
			count++;
			correct = false;
		} else if (guess > random) {
			System.out.println("DOWN!!!");
			count++;
			correct = false;
		}
	}
		
	public boolean isCorrect() {
		return correct;
	}
	
	
}
