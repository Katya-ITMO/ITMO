package laba4;

public class ArgumentException extends RuntimeException{

	private static final long serialVersionUID = 8845322666697290885L;
	private String message;

	public ArgumentException(String message) {
	       super(message);
	}
	
	@Override
    public String getMessage() {
		return this.message;
	}

}
