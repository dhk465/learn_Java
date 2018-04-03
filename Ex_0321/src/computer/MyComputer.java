package computer;

public class MyComputer {

	private int hdd = 200; // 하드디스크 용량
	private int ram = 8; // 램 용량
	
	private float cpu = 2.4f; // CPU
	
	private String color = "white"; // 컴퓨터 색채
	
	// 컴퓨터의 정보를 출력하는 메서드 method
	public void getInfo() {
		System.out.printf("HDD:\t%d\tGB\nRAM:\t%d\tGB\nCPU:\t%.2f\tGHz\n색상:\t%s\n", hdd, ram, cpu, color);
		System.out.println("------------------------");
	}
	
	public void setInfo(int hdd, int ram, float cpu, String color) {
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
		this.color = color;
	}
	
	/*
		접근제한	반환형	메서드명(파라미터) {메서드 수행 영역}
		
		public	void	getInfo() {	...	}
		
		1. 접근제한자
			i)		public		같은 프로젝트 내의 모든 객체들에게 사용을 허가
			ii)		private		현재 클래스 내에서만 사용을 허가
			iii)	protected	상속관계의 객체에만 사용을 허가
			iv)		default		같은 패키지 내의 모든 객체들에게 사용을 허가
			
		2. 반환형	
	 */
	
}
