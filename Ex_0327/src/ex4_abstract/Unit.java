package ex4_abstract;

public abstract class Unit {

	String name;
	int energy;
	boolean fly;
	
	public int getEnergy() {
		return energy;
	}
	
	//유닛이 공격을 당할때마다 체력 감소량 관리를 위해 호출되는 메서드
	//유닛마자 체력 감소량이 다르기 때문에 추상으로 정의해둠
	abstract public void encounter();
	
}
