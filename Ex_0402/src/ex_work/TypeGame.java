package ex_work;

import java.util.ArrayList;
import java.util.Random;

public class TypeGame extends Thread {

	private ArrayList<String> arr;
	private String[] data;
	
	private boolean isPlaying = true; // ������ ����
	
	public TypeGame(ArrayList<String> arr, String[] data) {
		this.arr = arr;
		this.data = data;
	}
	
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	@Override
	public void run() {
		
		while (isPlaying) {
			
			// 3�� �������� data �迭�� ���� �ϳ��� �������� �����Ͽ� arr�� ����
			
			int rand = new Random().nextInt(data.length);
			arr.add(data[rand]);
			
			try {
				
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // try-catch
			
			System.out.println(arr);
		
		} // while
		
	} // run()
	
	/*
	�غ��س��� ���ڿ� �迭�� ���� 3�� �������� arrayList�� �߰�
	
	String[] data = { "apple", "orange", "grape" };
	
	------------------------
	[orange]
	>> orange
	[apple]
	>> apple
	[grape, apple]
	>> apple
	[grape]
	>> grape
	[orange]
	>> orange
	Ŭ����!!!
	
	 */
	
	
	
}