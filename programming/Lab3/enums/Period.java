package enums;

public enum Period {
	ONES("однажды"),
	OFTEN("часто"),
	USUALLY("обычно"),
	CONSTANTLY("постоянно"),
	NO("");
	private String type;

    Period(String type) {
        this.type = type;
    }

    public String Type() {
        return this.type;
    }
}
