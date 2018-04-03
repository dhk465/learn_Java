package ex3_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(150);
		list.add(110);
		list.add(100);
		list.add(110); // 중복된 값 허용
		
		list.remove(1);// 1번 인덱스의 값(110)이 빠지면 그 뒤의 인덱스들이 (i - 1)번 이 된다.
		
		System.out.println("size: " + list.size());
		System.out.println(list);
		
		list.add(2, 102); // 2번 인덱스 방에 102을 넣어준다. 원래 그 방과 뒷번에 들어있던 값은 (i + 1)번 방으로 넘어간다.
		
		list.set(0, 155); // 0번 인덱스 방의 값을 155로 바꾸어준다.
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		} // for-loop
		
		boolean con = list.contains(127); // 만일 list가 127 값을 포함 한다면 true 아니면 false
		
		list.clear(); // list를 비운다.
		System.out.println("\nsize: " + list.size());
		
		System.out.println("----------------------");
		
		List<String> arr = new ArrayList<>(); // 위의 선언 방법보다 메모리 사용이 '덜'하다.
		arr.add("홍길동");
		arr.add("김길동");
		System.out.println(arr);
		
	}
}
