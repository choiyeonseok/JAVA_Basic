package game;

public class HolyKnight extends Knight implements Healer{

	public HolyKnight(String name, int hp, int armor) {
		super(name, hp, armor);
		
	}

	@Override
	public void healingAura() {
		System.out.println(name + "�� ��ų�� �����մϴ�.!!");
		System.out.println("\t �ʴ� ü��ȸ���� + 10 �����մϴ�.");
	}

	@Override
	public void holyArmor() {
		System.out.println(name + "�� ��ų�� �����մϴ�.!!");
		System.out.println("\t ��������  -10 �� �޽��ϴ�.");
		
	}

}
