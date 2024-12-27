package enviroment;

import enums.Period;
import laba4.Destroyable;

public class Evil extends NoObj implements Destroyable{
	
	public Evil(String name) {
		super(name);
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
	
	public void seem() {
		String answer = this.toString() + " представляется верхом испытаний";
		System.out.println(answer);
	}
}
