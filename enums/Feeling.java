package enums;

public enum Feeling {
	HORROR("ужас"),
	FEAR("страх"),
	SURPRISE("удивление"),
	NO("");
	private String type;

    Feeling(String type) {
        this.type = type;
    }

    public String Type() {
        return this.type;
    }
}
