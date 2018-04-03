package ex2_map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		
		// HashMap<key, value> name = new HashMap<>();
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		map.put(0, true);
		map.put(1, false);
		
		System.out.println(map.size());
		
		boolean res = map.get(1);
		
		System.out.println(res);
		
		System.out.println("------------------");
		
		HashMap<String, String> map2 = new HashMap<>();
		
		map2.put("k1", "나의 key는 k1");
		map2.put("k2", "나의 key는 k2");
		map2.put("k3", "나의 key는 k3");
		
		System.out.println(map2);
		
		String res2 = map2.get("k3");
		
		System.out.println(res2);
		
		System.out.println("-------------------");
		
		if (map2.containsKey("k2")) {
			System.out.println("k2 키가 존재함");
		}
		
		if (map2.containsValue("나의 key는 k3")) {
			System.out.println("'나의 key는 k3'가 존재함");
		}
		
	}
}
