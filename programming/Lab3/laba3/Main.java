package laba3;

import enviroment.Evil;
import enviroment.Human1;
import enviroment.Human2;
import enviroment.NoObj;
import enviroment.Obj;
import enviroment.Savage;

import java.util.ArrayList;

import enums.Feeling;
import enums.Period;
import enums.Place;

public class Main {

	public static void main(String[] args) {
		
		Human2 reader = new Human2("читатель", true, Place.NO);
		Human2 human = new Human2("человек", true, Place.NO);
		Evil evil = new Evil("зло");
		NoObj badluck = new NoObj("несчастья");
		Human1 narrator = new Human1("рассказчик", true, Place.HOUSE);
		Obj fire = new Obj("огонь", 2);
		Savage savages = new Savage("дикари", true, Place.OTHERSHORE);
		ArrayList<String> infData = new ArrayList<String>();
		infData.add("23 год, зима, декабрь - время южного солнцестояния");
		ArrayList<String> infWeather = new ArrayList<String>();
		infWeather.add("жаркая");
		ArrayList<String> infTime = new ArrayList<String>();
		infTime.add("рассвет");
		Enviroment data = new Enviroment("дата", infData);
		Enviroment time = new Enviroment("время", infTime);
		Enviroment weather = new Enviroment("погода", infWeather);
		
		reader.read();
		reader.notice();
		human.feel(Feeling.FEAR);
		evil.repeat(3, human);
		evil.seem();
		evil.destroy(Period.OFTEN, badluck);
		narrator.example();
		data.printInf();
		weather.printInf();
		narrator.work(Period.CONSTANTLY, Place.FIELD);
		narrator.changeLocation(Place.HOUSE);
		narrator.move(5, Period.ONES, Place.NO);
		time.printInf();
		narrator.seeObj(fire);
		narrator.feel(Feeling.SURPRISE);
		fire.move(0, Period.NO, Place.MYSHORE);
		fire.printDist(Place.HOUSE);
		narrator.feel(Feeling.SURPRISE);
		savages.disembark(Period.USUALLY, Place.OTHERSHORE);
		
	}

}
