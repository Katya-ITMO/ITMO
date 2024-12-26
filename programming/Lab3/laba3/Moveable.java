package laba3;

import enums.Period;
import enums.Place;

public interface Moveable {
	void move(int speed, Period period, Place placeTo) throws SpeedMoveException;
}
