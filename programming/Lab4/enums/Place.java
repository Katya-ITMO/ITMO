package enums;

public enum Place {
	FIELD("поле"),
	HOUSE("дом"),
	MYSHORE("берег"),
	OTHERSHORE("другая сторона острова"),
	ISLAND("остров"),
	CAVE("пещера"),
	BRAZIL("Бразилия"),
	FOREST("лес"),
	WALL("лафет вдоль наружной стены"),
	MOUNT("гора"),
	TOP("вершина горы"),
	BONFIRE("кружок у костра"),
	NO("");
	private String type;

    Place(String type) {
        this.type = type;
    }

    public String Type() {
        return this.type;
    }
}
