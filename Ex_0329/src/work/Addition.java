package work;

import java.util.Random;

public class Addition implements Runnable {
	/*	
		1-100������ ���� �ΰ��� ���ϴ� ������ ����
		
			65 + 15
		
		Ű���忡�� ���� �Է¹ް�
		
			���� 1) 65 + 15 = 80|
		
		5������ ���� ó���Ǹ� ���α׷� ����
		
			���� 5) 12 + 3 = 15
			����!
			����...
		
		�ټ����� ��� ������� ���ʰ� ����ߴ����� ���
		
			�� 32 �� ���
		
		sleep���� �ð��� ���
		
		���󽺷��带 ������� �ʰ� ���α׷��� �����Ѵ�.
	 */
	
	private int random1 = new Random().nextInt(100) + 1;
	private int random2 = new Random().nextInt(100) + 1;
	private final int FINISH = 5;
	
	public int getFINISH() {
		return FINISH;
	}

	public void resetGame() {
		random1 = new Random().nextInt(100) + 1;
		random2 = new Random().nextInt(100) + 1;
	}
	
	public int getRandom1() {
		return random1;
	}

	public int getRandom2() {
		return random2;
	}
	
	public boolean isCorrect(int num) {
		if (num == random1 + random2) {
			System.out.println("Correct!");
			count++;
			return true;
		} else {
			System.out.println("Incorrect!");
			return false;
		} 
	}
	
	private int second = 0;
	
	public int getSecond() {
		return second;
	}

	private int count = 0;
	
	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		
		while (count < FINISH) {
			
			try {
				
				Thread.sleep(1000);
				++second;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // try-catch
			
		} // while
		
	} // run()
	
}