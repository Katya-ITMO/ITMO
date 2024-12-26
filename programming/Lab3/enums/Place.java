package enums;

public enum Place {
	FIELD("поле"),
	HOUSE("дом"),
	MYSHORE("берег"),
	OTHERSHORE("другая сторона острова"),
	NO("");
	private String type;

    Place(String type) {
        this.type = type;
    }

    public String Type() {
        return this.type;
    }
}
