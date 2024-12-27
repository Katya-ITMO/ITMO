package enviroment;

import enums.Place;

public class Cat extends NoHuman{

	public Cat(String name, boolean ifAlive, Place location, boolean wild) {
		super(name, ifAlive, location, wild);
		
	}
	
	public void eat() {
		String answer = this.toString() + " загрызли и уничтожили запасы";
		System.out.println(answer);
	}

}
