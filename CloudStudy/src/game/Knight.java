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
		System.out.println(name + "�� ��ų�� �����մϴ�.!!");
		System.out.println("\t �ƸӰ�  +5 �����մϴ�.");
		armor += 5;
	}

	@Override
	public void increaseHp() {
		System.out.println(name + "�� ��ų�� �����մϴ�.!!");
		System.out.println("\t ü���� +100 �����մϴ�.");
		hp += 100;
	}

}
