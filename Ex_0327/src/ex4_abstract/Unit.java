package ex4_abstract;

public abstract class Unit {

	String name;
	int energy;
	boolean fly;
	
	public int getEnergy() {
		return energy;
	}
	
	//������ ������ ���Ҷ����� ü�� ���ҷ� ������ ���� ȣ��Ǵ� �޼���
	//���ָ��� ü�� ���ҷ��� �ٸ��� ������ �߻����� �����ص�
	abstract public void encounter();
	
}
