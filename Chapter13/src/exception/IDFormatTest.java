package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {  //throws는 예외처리 미루기
		
		if(userID == null) {
			throw new IDFormatException("아이디는  null일 수 없습니다.");    //throw는 예외처리 발생시키기
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		
		this.userID = userID;
	}

	
	
	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);      //아이디는 null일 수 없습니다.
		}
	
		
		myId = "123456";
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);     //아이디는 8자 이상 20자 이하로 쓰세요.
		}
		
	}

}
