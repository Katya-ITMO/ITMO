package enviroment;

import enums.Feeling;
import enums.Period;
import enums.Place;
import laba4.SpeedMoveException;

public abstract class Animal {
	protected String name;
	protected boolean ifAlive;
	protected Place location;
	
	public Animal(String name, boolean ifAlive, Place location) {
        this.name = name;
        this.ifAlive = ifAlive;
        this.location = location;  
    }
	
	public abstract void live(int years);
	
	public abstract void seeObj(Obj Obj1);
	
	public abstract void seeAnimal(Animal animal);
	
	public abstract void move(int speed, Period period, Place placeTo) throws SpeedMoveException;
	
	public abstract void feel(Feeling feeling);
	
	public abstract void changeLocation(Place newLocation);
	
	public abstract void changeStatus();
	
	public abstract void forbiddenPlace(Place place);
	
	public abstract void kill(Animal animal);
	
}
