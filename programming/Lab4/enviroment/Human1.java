package enviroment;

import laba4.ArgumentException;
import laba4.Destroyable;
import laba4.Moveable;
import laba4.SpeedMoveException;

import java.util.Objects;

import enums.Feeling;
import enums.Period;
import enums.Place;

public class Human1 extends Animal implements Moveable, Destroyable{

	public Human1(String name, boolean ifAlive, Place location) {
		super(name, ifAlive, location);
	}
	
	public void example() {
		String answer = this.toString() + " приводит примеры из жизни";
		System.out.println(answer);
	}
	
	public void work(Period period, Place place) {
		if (place == Place.NO) {
			throw new ArgumentException("Недостаточно аргументов!");
		}
		this.location = place;
		String answer = this.toString();
		if (period != Period.NO) {
			answer += " " + period.Type();
		}
		answer += " работает в " + place.Type();
		System.out.println(answer);
	}
	
	public void imagine(Animal animal) {
		String answer = this.toString();
		answer += " воображает " + animal.toString();
		System.out.println(answer);
	}
	
	public void dig() {
		String answer = this.toString() + " роет яму";
		System.out.println(answer);
	}
	
	public void bury(Animal animal) {
		String answer = this.toString() + " закапывает " + animal.toString() + " в яму";
		System.out.println(answer);
	}
	
	public void makeUp(NoObj obj) {
		String answer = this.toString() + " придумал " + obj.toString();
		System.out.println(answer);
	}
	
	public void teach(Parrot parrot) {
		String answer = this.toString() + " научил " + parrot.toString();
		parrot.ifSpeak = true;
		System.out.println(answer);
	}
	
	public void hear(Parrot parrot) {
		String answer = this.toString() + " слушает " + parrot.toString();
		System.out.println(answer);
	}
	
	public void shoot(Animal animal) {
		String answer = this.toString() + " стреляет по " + animal.toString();
		System.out.println(answer);
	}
	
	public void tame(NoHuman animal) {
		animal.wild = false;
		String answer = this.toString() + " приручил " + animal.toString();
		System.out.println(answer);
	}
	
	public void wasteTime() {
		String answer = this.toString() + " потратил больше времени и труда";
		System.out.println(answer);
	}
	
	public void plantTrees() {
		String answer = this.toString() + " посадил деревья";
		System.out.println(answer);
	}
	
	public void hide(Animal animal) {
		String answer = this.toString() + " скрывается";
		if (!this.equals(animal)) {
			answer += " от " + animal.toString();
		}
		if (location != Place.NO) {
			answer += " в " + location.Type();
		}
		System.out.println(answer);
	}
	
	public void bide() {
		String answer = this.toString() + " не смеет ступить дальше ни шагу";
		System.out.println(answer);
	}
	
	public void raise(Obj obj) {
		String answer = this.toString() + " поднял " + obj.toString();
		System.out.println(answer);
	}
	
	public void noTracks() {
		String answer = this.toString() + " заметает следы";
		System.out.println(answer);
	}
	
	public void defense() {
		String answer = this.toString() + " готовится к обороне";
		System.out.println(answer);
	}
	
	public void charge(Obj obj) {
		String answer = this.toString() + " заряжает " + obj.toString();
		System.out.println(answer);
	}
	
	public void noScouts() {
		String answer = this.toString() + " не мог послать разведчиков";
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
			case 1: answer += " сидит "; break;
			case 2: answer += " стоит "; break;
			case 5: answer += " идёт "; break;
			case 10: answer += " бежит ";
			}
			if (location != Place.NO) {
				answer += "из " + this.location.Type();
			}
			if (placeTo != Place.NO) {
				answer += "в " + placeTo.Type();
			}
			System.out.println(answer);
			this.location = placeTo;
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
	public void destroy(Period period, NoObj obj1) {
		String answer = this.toString();
		if (period != Period.NO) {
			answer += " " + period.Type();
		}
		answer += " избавляет от " + obj1.toString();
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
        Human1 h = (Human1) obj;
        return this.name == h.name;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
