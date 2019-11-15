package game;

public class Knight implements Tanker{

	protected String name;
	protected int hp;
	protected int armor;
	
	public Knight(String name, int hp, int armor){
		this.name = name;
		this.hp = hp;
		this.armor = armor;
	}
	
	@Override
	public void increaseArmor() {
		System.out.println(name + "이 스킬을 시전합니다.!!");
		System.out.println("\t 아머가  +5 증가합니다.");
		armor += 5;
	}

	@Override
	public void increaseHp() {
		System.out.println(name + "이 스킬을 시전합니다.!!");
		System.out.println("\t 체력이 +100 증가합니다.");
		hp += 100;
	}

}
