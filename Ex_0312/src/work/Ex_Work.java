package work;

public class Ex_Work {
	
	public static void main(String[] args) {
		
		/*
			과수원이 있습니다.
			배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 과일의 수는 각각
			5, 7, 5개다.
			
			출력과제:
			1. 과수원에서 하루에 생산되는 과일의 총 갯수(int)
			2. 시간당 평균 생산 갯수(float)
		*/
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int sum = pear + apple + orange;
		float avg = sum / 24f;
		
		System.out.println("과수원 하루 생산량: " + sum + "개");
		System.out.println("과수원 시간당 생산량: " + avg + "개");
		
	}
	
}
