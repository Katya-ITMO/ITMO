package enviroment;

import enums.Place;

public class Bird extends NoHuman{

	public Bird(String name, boolean ifAlive, Place location, boolean wild) {
		super(name, ifAlive, location, wild);
		
	}
	
	public void fly() {
		String answer = this.toString();
		if (!wild) {
			answer += " не летает";
		}
		else {
			answer += " летает";
			if (this.location !=Place.NO) {
				answer += location.Type();
			}
		}
		System.out.println(answer);
	}

}
