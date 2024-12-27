package enviroment;

import enums.Place;

public class Parrot extends Bird{

	public boolean ifSpeak;

	public Parrot(String name, boolean ifAlive, Place location, boolean wild, boolean ifSpeak) {
		super(name, ifAlive, location, wild);
		this.ifSpeak = ifSpeak;
		
	}
	
	public void speak(String word) {
		String answer = this.toString();
		if(!ifSpeak) {
			answer += " не умеет разговаривать";
		}
		else {
			if(word == "") {
				answer += " разговаривает";
			}
			else {
				answer += " говорит '" + word + "'";
			}
		}
		System.out.println(answer);
	}
	
	public void call() {
		String answer = this.toString() + " зовёт Робинзона Крузо";
		System.out.println(answer);
	}

}
