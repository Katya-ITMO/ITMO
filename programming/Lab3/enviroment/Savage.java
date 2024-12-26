package enviroment;

import java.util.Objects;

import enums.Feeling;
import enums.Period;
import enums.Place;
import laba3.ArgumentException;
import laba3.Moveable;
import laba3.SpeedMoveException;

public class Savage extends Animal implements Moveable{

	public Savage(String name, boolean ifAlive, Place location) {
		super(name, ifAlive, location);
	}
	
	public void disembark(Period period, Place place) {
		
		String answer = this.toString();
		if (period != Period.NO) {
			answer += " " + period.Type();
		}
		if (place != Place.NO) {
			answer += " высаживаются в " + place.Type();
		}
		System.out.println(answer);
	}
	

	@Override
	public void seeObj(Obj Obj1) {
		String answer = this.toString() + " видит " + Obj1.toString();
		System.out.println(answer);
	}

	@Override
	public void move(int speed, Period period, Place placeTo) {
		try {
			String answer = this.toString();
			if (period != Period.NO) {
				answer += " " + period.Type();
			}
			if (speed < 0) {
				throw new SpeedMoveException("Человек не может передвигаться с отрицательной скоростью!");
			}
			switch (speed) {
			case 0: answer += " лежит "; break;
			case 1: answer += " сидит " + period.Type(); break;
			case 2: answer += " стоит " + period.Type(); break;
			case 5: answer += " идёт " + period.Type(); break;
			case 10: answer += " бежит " + period.Type();
			}
			if (location != Place.NO) {
				answer += "из " + this.location.Type();
			}
			if (placeTo != Place.NO) {
				answer += "в " + placeTo.Type();
			}
			System.out.println(answer);
		}
		catch(SpeedMoveException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public void feel(Feeling feeling) {
		if (feeling == Feeling.NO) {
			throw new ArgumentException("Недостаточно аргументов!");
		}
		String answer = this.toString() + " испытывает " + feeling.Type();
		System.out.println(answer);
	}
	
	@Override
	public void changeLocation(Place newLocation) {
		this.location = newLocation;
	}
	
	@Override
    public String toString() {
        return this.name;
    }
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Savage)) {
            return false;
        }
        Savage s = (Savage) obj;
        return this.name == s.name;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
