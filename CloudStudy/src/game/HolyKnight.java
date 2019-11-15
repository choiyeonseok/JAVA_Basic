package game;

public class HolyKnight extends Knight implements Healer{

	public HolyKnight(String name, int hp, int armor) {
		super(name, hp, armor);
		
	}

	@Override
	public void healingAura() {
		System.out.println(name + "이 스킬을 시전합니다.!!");
		System.out.println("\t 초당 체력회복이 + 10 증가합니다.");
	}

	@Override
	public void holyArmor() {
		System.out.println(name + "이 스킬을 시전합니다.!!");
		System.out.println("\t 데미지를  -10 덜 받습니다.");
		
	}

}
