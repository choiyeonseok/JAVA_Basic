package collectionset;

public class Member {

	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원임의 아이디는 " + memberId + "입니다.";
	}
	
	//둘다 재정의 되어야한드앗!!!
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;	
			return (this.memberId == member.memberId);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
}
