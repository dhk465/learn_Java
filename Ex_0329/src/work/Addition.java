package work;

import java.util.Random;

public class Addition implements Runnable {
	/*	
		1-100사이의 난수 두개를 더하는 문제가 출제
		
			65 + 15
		
		키보드에서 답을 입력받고
		
			문제 1) 65 + 15 = 80|
		
		5문제가 정답 처리되면 프로그램 종료
		
			문제 5) 12 + 3 = 15
			정답!
			종료...
		
		다섯문제 모두 정답까지 몇초가 경과했는지를 출력
		
			총 32 초 경과
		
		sleep으로 시간을 기록
		
		데몬스레드를 사용하지 않고 프로그램을 종료한다.
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
