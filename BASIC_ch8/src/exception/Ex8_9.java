package exception;

class UnsupportedFuctionException extends RuntimeException{
	
	final private int ERR_CODE;
	
	UnsupportedFuctionException(String message, int ERR_CODE){
		super(message);
		this.ERR_CODE = ERR_CODE;
	}
	
	UnsupportedFuctionException(String message){
		this(message,  100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
	
}


public class Ex8_9 {
	
	
	public static void main(String[] args) throws Exception {

		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
		
	}

}
