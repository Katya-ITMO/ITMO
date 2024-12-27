package enviroment;

import java.util.Objects;

import enums.Feeling;
import enums.Period;
import enums.Place;
import laba4.ArgumentException;
import laba4.Moveable;
import laba4.SpeedMoveException;

public class Human2 extends Animal implements Moveable{

	public Human2(String name, boolean ifAlive, Place location) {
		super(name, ifAlive, location);
	}
	
	public void read() {
		String answer = this.toString() + " читает повесть";
		System.out.println(answer);
	}
	
	public void notice() {
		String answer = this.toString() + " обращает внимание";
		System.out.println(answer);
	}
	
	@Override
	public void live(int years) {
		String answer = this.toString();
		if (this.ifAlive) {
			answer += " живёт";
		}
		else {
			answer += " умер";
		}
		if (location != Place.NO) {
			answer += " в " + location.Type();
		}
		if (years >= 0) {
			answer += " " + years + " лет";
		}
		System.out.println(answer);
	}

	@Override
	public void seeObj(Obj Obj1) {
		String answer = this.toString() + " видит " + Obj1.toString();
		System.out.println(answer);
	}
	
	@Override
	public void seeAnimal(Animal animal) {
		String answer = this.toString() + " видит " + animal.toString();
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
	public void changeStatus() {
		this.ifAlive = !this.ifAlive;
		
	}
	
	@Override
	public void forbiddenPlace(Place place) {
		String answer = place.Type() + " недоступно для " + this.toString();
		System.out.println(answer);
	}
	
	@Override
	public void kill(Animal animal) {
		animal.ifAlive = false;
		String answer = this.toString() + " убил " + animal.toString();
		System.out.println(answer);
	}
	
	@Override
    public String toString() {
        return this.name;
    }
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Human2 h = (Human2) obj;
        return this.name == h.name;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

