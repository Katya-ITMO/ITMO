package enums;

public enum Feeling {
	HORROR("ужас"),
	FEAR("страх"),
	SURPRISE("удивление"),
	CALM("спокойствие"),
	JOY("радость"),
	WORRY("беспокойство"),
	TIRED("усталость"),
	NO("");
	private String type;

    Feeling(String type) {
        this.type = type;
    }

    public String Type() {
        return this.type;
    }
}
