package game;

public class MagicKnight extends Knight implements Sorcerer{

	public MagicKnight(String name, int hp, int armor) {
		super(name, hp, armor);
	}

	@Override
	public void fireArmor() {
		System.out.println(name + "�� ��ų�� �����մϴ�.!!");
		System.out.println("\t �ֺ��� �ʴ� ��������  + 10 �����մϴ�.");
	}

	@Override
	public void thunderBlade() {
		System.out.println(name + "�� ��ų�� �����մϴ�.!!");
		System.out.println("\t ���ݽ� �߰� ��������  + 10 �����մϴ�.");
	}

}
