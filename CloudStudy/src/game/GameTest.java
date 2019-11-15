package game;

public class GameTest {

	public static void main(String[] args) {
		// 두 영웅 생성
	    Knight uther = new HolyKnight("우서", 200, 10);
	    Knight arthas = new MagicKnight("아서스", 150, 8);
	    
	    // 우서: 기사 버프
	    uther.increaseHp();
	    uther.increaseArmor();
	    
	    // 우서: 성기사 버프
	    HolyKnight holyUther = (HolyKnight) uther;
	    holyUther.healingAura();
	    holyUther.holyArmor();
	    
	    // 아서스: 기사 버프
	    arthas.increaseHp();
	    arthas.increaseArmor();
	    
	    // 아서스: 마검사 버프
	    MagicKnight magicArthas = (MagicKnight) arthas;
	    magicArthas.fireArmor();
	    magicArthas.thunderBlade();

	}

}
