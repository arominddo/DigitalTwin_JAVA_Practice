package ch08.Exercise8_9;

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;
	
	public UnsupportedFuctionException (String msg, int err_code) {
		super (msg);
		ERR_CODE = err_code;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + ERR_CODE + "]" + super.getMessage();
	
	}
	
	
	
}






public class Exercise8_9 {

	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}

}
