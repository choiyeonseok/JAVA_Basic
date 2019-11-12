package collection.treemap;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberPark);
		manager.addMember(memberKim);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
