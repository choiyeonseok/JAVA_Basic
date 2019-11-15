package game;

public class GameTest {

	public static void main(String[] args) {
		// �� ���� ����
	    Knight uther = new HolyKnight("�켭", 200, 10);
	    Knight arthas = new MagicKnight("�Ƽ���", 150, 8);
	    
	    // �켭: ��� ����
	    uther.increaseHp();
	    uther.increaseArmor();
	    
	    // �켭: ����� ����
	    HolyKnight holyUther = (HolyKnight) uther;
	    holyUther.healingAura();
	    holyUther.holyArmor();
	    
	    // �Ƽ���: ��� ����
	    arthas.increaseHp();
	    arthas.increaseArmor();
	    
	    // �Ƽ���: ���˻� ����
	    MagicKnight magicArthas = (MagicKnight) arthas;
	    magicArthas.fireArmor();
	    magicArthas.thunderBlade();

	}

}
