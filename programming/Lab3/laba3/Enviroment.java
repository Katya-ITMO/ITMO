package laba3;

import java.util.ArrayList;

public record Enviroment(String name, ArrayList<String> description) {
	
	public void printInf() {
		System.out.print(name + ": ");
		for (int i = 0; i < description.size() - 1; i++) {
			System.out.print(description.get(i) + ", ");
        }
		System.out.println(description.get(description.size()-1));
	}
	
}
