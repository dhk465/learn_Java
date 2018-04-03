package computer;

public class MyComputer {

	private int hdd = 200; // �ϵ��ũ �뷮
	private int ram = 8; // �� �뷮
	
	private float cpu = 2.4f; // CPU
	
	private String color = "white"; // ��ǻ�� ��ä
	
	// ��ǻ���� ������ ����ϴ� �޼��� method
	public void getInfo() {
		System.out.printf("HDD:\t%d\tGB\nRAM:\t%d\tGB\nCPU:\t%.2f\tGHz\n����:\t%s\n", hdd, ram, cpu, color);
		System.out.println("------------------------");
	}
	
	public void setInfo(int hdd, int ram, float cpu, String color) {
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
		this.color = color;
	}
	
	/*
		��������	��ȯ��	�޼����(�Ķ����) {�޼��� ���� ����}
		
		public	void	getInfo() {	...	}
		
		1. ����������
			i)		public		���� ������Ʈ ���� ��� ��ü�鿡�� ����� �㰡
			ii)		private		���� Ŭ���� �������� ����� �㰡
			iii)	protected	��Ӱ����� ��ü���� ����� �㰡
			iv)		default		���� ��Ű�� ���� ��� ��ü�鿡�� ����� �㰡
			
		2. ��ȯ��	
	 */
	
}
