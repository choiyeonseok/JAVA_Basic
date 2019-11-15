package game;

public class MagicKnight extends Knight implements Sorcerer{

	public MagicKnight(String name, int hp, int armor) {
		super(name, hp, armor);
	}

	@Override
	public void fireArmor() {
		System.out.println(name + "이 스킬을 시전합니다.!!");
		System.out.println("\t 주변적 초당 데미지가  + 10 증가합니다.");
	}

	@Override
	public void thunderBlade() {
		System.out.println(name + "이 스킬을 시전합니다.!!");
		System.out.println("\t 공격시 추가 데미지가  + 10 증가합니다.");
	}

}
