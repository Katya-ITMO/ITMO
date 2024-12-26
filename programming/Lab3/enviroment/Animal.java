package enviroment;

import enums.Feeling;
import enums.Period;
import enums.Place;
import laba3.SpeedMoveException;

public abstract class Animal {
	protected String name;
	protected boolean ifAlive;
	protected Place location;
	
	public Animal(String name, boolean ifAlive, Place location) {
        this.name = name;
        this.ifAlive = ifAlive;
        this.location = location;  
    }
	
	public abstract void seeObj(Obj Obj1);
	
	public abstract void move(int speed, Period period, Place placeTo) throws SpeedMoveException;
	
	public abstract void feel(Feeling feeling);
	
	public abstract void changeLocation(Place newLocation);
}
