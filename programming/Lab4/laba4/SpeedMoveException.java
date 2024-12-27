package laba4;

public class SpeedMoveException extends Exception {

	private static final long serialVersionUID = -9154055235334141767L;
	private String message;

	public SpeedMoveException(String message) {
	       super(message);
	}
	
	@Override
    public String getMessage() {
		return this.message;
	}
}
