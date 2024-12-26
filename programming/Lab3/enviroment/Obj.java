package enviroment;

import java.util.Objects;

import enums.Period;
import enums.Place;
import laba3.Moveable;

public class Obj implements Moveable{
	private String name;
	private int dist;
	
	public Obj(String name, int dist) {
		this.name = name;
        this.dist = dist;
    }
	
	public int getDist() {
		return this.dist;
	}
	
	public void printDist(Place place) {
		String answer = "расстояние от " + this.toString() + " до " + place.Type() + ": " + this.getDist() + " мили";
		System.out.println(answer);
	}
	
	public void move(int speed, Period period, Place place) {
		String answer = this.toString();
		if (period != Period.NO) {
			answer += " " + period.Type();
		}
		if (speed == 0) {
			answer += " находится в " + place.Type();
		}
		if (speed > 0) {
			answer += " приближается к " + place.Type();
		}
		if (speed < 0) {
			answer += " удаляется от " + place.Type();
		}
		System.out.println(answer);
	}
	
	@Override
    public String toString() {
        return this.name;
    }
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Obj)) {
            return false;
        }
        Obj o = (Obj) obj;
        return this.name == o.name;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
