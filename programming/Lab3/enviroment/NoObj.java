package enviroment;

import java.util.Objects;

public class NoObj {
	private String name;
	
	public NoObj(String name) {
		this.name = name;
    }
	
	public void repeat(int count, Animal animal) {
		String answer = this.toString();
		if (count == 1) {
			answer += " происходит ";
			if (animal.toString() != "") {
				answer += "с " + animal.toString();
			}
		}
		if (count == 2) {
			answer += " повторяется ";
			if (animal.toString() != "") {
				answer += "с " + animal.toString();
			}
		}
		if (count > 2) {
			answer += " преследует ";
			if (animal.toString() != "") {
				answer += animal.toString(); 
			}
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
        if (!(obj instanceof NoObj)) {
            return false;
        }
        NoObj o = (NoObj) obj;
        return this.name == o.name;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
