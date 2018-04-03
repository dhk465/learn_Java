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
			System.out.println(count + "ȸ���� ������ ���߾����ϴ�!");
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
